#!/bin/bash

# Device Update Script for Android Compose Preview Extensions
# This script updates the device specifications by fetching the latest device
# information from the Android Device Catalog CSV maintained by Google Play Store.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(cd "$SCRIPT_DIR/.." && pwd)"
DEVICES_FILE="$PROJECT_DIR/library/src/main/kotlin/com/premex/compose/preview/Devices.kt"
DEVICE_EXTENSIONS_DIR="$PROJECT_DIR/library/src/main/kotlin/com/premex/compose/preview/devices"
TEMP_DIR="$PROJECT_DIR/.tmp-$$"
BACKUP_DIR="$PROJECT_DIR/.device-backups"
CATALOG_URL="https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv"
AGG_FILE="$TEMP_DIR/aggregated_specs.txt"

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

log() {
    echo -e "${GREEN}[INFO]${NC} $1"
}

warn() {
    echo -e "${YELLOW}[WARN]${NC} $1"
}

error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

debug() {
    if [[ "${DEBUG:-}" == "1" ]]; then
        echo -e "${BLUE}[DEBUG]${NC} $1"
    fi
}

cleanup() {
    if [[ -d "$TEMP_DIR" ]]; then
        rm -rf "$TEMP_DIR"
    fi
}

trap cleanup EXIT

create_backup() {
    log "Creating backup of current devices file..."
    mkdir -p "$BACKUP_DIR"
    cp "$DEVICES_FILE" "$BACKUP_DIR/Devices.kt.$(date +%Y%m%d_%H%M%S)"

    # Also backup existing device extension files
    if [[ -d "$DEVICE_EXTENSIONS_DIR" ]]; then
        cp -r "$DEVICE_EXTENSIONS_DIR" "$BACKUP_DIR/devices.$(date +%Y%m%d_%H%M%S)" 2>/dev/null || true
    fi
}

ensure_temp() {
    mkdir -p "$TEMP_DIR"
    mkdir -p "$DEVICE_EXTENSIONS_DIR"
}

sanitize_manufacturer_name() {
    local manufacturer="$1"
    # Normalize manufacturer names to proper case and remove special characters
    case "${manufacturer,,}" in
        "google") echo "Google" ;;
        "samsung") echo "Samsung" ;;
        "xiaomi"|"redmi") echo "Xiaomi" ;;
        "oneplus") echo "OnePlus" ;;
        "huawei") echo "Huawei" ;;
        "oppo") echo "Oppo" ;;
        "vivo") echo "Vivo" ;;
        "motorola") echo "Motorola" ;;
        "lg") echo "LG" ;;
        "sony") echo "Sony" ;;
        "htc") echo "HTC" ;;
        "nokia") echo "Nokia" ;;
        "honor") echo "Honor" ;;
        "realme") echo "Realme" ;;
        "mobicell"|"mobicel") echo "Mobicell" ;;
        "navitel") echo "Navitel" ;;
        "opelmobile") echo "OpelMobile" ;;
        "dexp") echo "DEXP" ;;
        "edenwood") echo "Edenwood" ;;
        "hyundai") echo "Hyundai" ;;
        *)
            # Handle names starting with numbers by prefixing with underscore
            local clean_name=$(echo "$manufacturer" | sed 's/\b\(.\)/\u\1/g' | tr -cd 'A-Za-z0-9')
            if [[ "$clean_name" =~ ^[0-9] ]]; then
                clean_name="_$clean_name"
            fi
            echo "$clean_name"
            ;;
    esac
}

sanitize_device_name() {
    local device="$1"
    # Convert device name to valid Kotlin constant, handling duplicates will be done later
    local clean_name=$(echo "$device" | sed -E 's/[^A-Za-z0-9]+/_/g; s/__+/_/g; s/^_|_$//g' | tr '[:lower:]' '[:upper:]')
    # If starts with number, prefix with underscore
    if [[ "$clean_name" =~ ^[0-9] ]]; then
        clean_name="_$clean_name"
    fi
    echo "$clean_name"
}

sanitize_class_name() {
    local manufacturer="$1"
    # Convert manufacturer name to valid Kotlin class name
    local clean_name=$(echo "$manufacturer" | sed -E 's/[^A-Za-z0-9]+//g')
    # If starts with number, prefix with underscore
    if [[ "$clean_name" =~ ^[0-9] ]]; then
        clean_name="_$clean_name"
    fi
    echo "$clean_name"
}

spec_line_exists() {
    local manufacturer="$1" device="$2"
    [[ -f "$AGG_FILE" ]] || return 1
    grep -q "^${manufacturer}|${device}|" "$AGG_FILE" 2>/dev/null || return 1
}

add_device() {
    local manufacturer="$1" device="$2" width="$3" height="$4" dpi="$5" model_name="$6"
    local spec="spec:width=${width},height=${height},unit=px,dpi=${dpi}"

    if spec_line_exists "$manufacturer" "$device"; then
        debug "Skipping duplicate $manufacturer $device"
        return 0
    fi

    echo "${manufacturer}|${device}|${spec}|${model_name}" >> "$AGG_FILE"
    debug "Added device: $manufacturer $device (${width}x${height} @ ${dpi}dpi) - $model_name"
}

fetch_android_catalog() {
    log "Fetching Android Device Catalog CSV from Play Store..."

    local catalog_csv
    if ! catalog_csv=$(curl -fsSL "$CATALOG_URL" 2>/dev/null); then
        error "Failed to fetch Android Device Catalog from $CATALOG_URL"
        exit 1
    fi

    # Check if we got data
    local csv_lines=$(echo "$catalog_csv" | wc -l)
    log "Downloaded CSV with $csv_lines lines"

    log "Processing Android Device Catalog CSV..."
    ensure_temp
    : > "$AGG_FILE"

    # Use awk for much faster CSV processing - single pass through the data
    echo "$catalog_csv" | awk -F',' '
    BEGIN {
        processed = 0
        added = 0
        OFS = "|"
    }
    NR == 1 { next }
    {
        processed++
        if (processed % 500 == 0) {
            print "[INFO] Processed " processed " lines..." > "/dev/stderr"
        }

        # Clean quotes from key fields
        gsub(/"/, "", $1)
        gsub(/"/, "", $3)
        gsub(/"/, "", $4)
        gsub(/"/, "", $6)
        gsub(/"/, "", $9)
        gsub(/"/, "", $10)

        brand = $1
        manufacturer = $3
        model = $4
        form_factor = $6
        screen_sizes = $9
        screen_densities = $10

        # Skip if missing essential data or wrong form factor
        if (!brand || !model || !screen_sizes || !screen_densities) next
        if (form_factor != "Phone" && form_factor != "Tablet" && form_factor != "Foldable") next

        # Use manufacturer if available, otherwise brand
        device_mfr = (manufacturer ? manufacturer : brand)

        # Parse screen size - take first one if multiple (before semicolon)
        split(screen_sizes, sizes, ";")
        if (match(sizes[1], /^([0-9]+)x([0-9]+)$/)) {
            width = substr(sizes[1], RSTART, RLENGTH)
            split(width, dims, "x")
            width = dims[1]
            height = dims[2]

            # Parse density - take first one
            split(screen_densities, densities, ";")
            if (match(densities[1], /^[0-9]+$/)) {
                dpi = densities[1]
                spec = "spec:width=" width ",height=" height ",unit=px,dpi=" dpi

                # Sanitize device manufacturer name
                device_mfr = sanitize_manufacturer(device_mfr)
                device_name = sanitize_device_name(model)

                print device_mfr, device_name, spec, model
                added++
            }
        }
    }
    END {
        print "[INFO] CSV Processing completed: " processed " processed, " added " added" > "/dev/stderr"
    }

    function sanitize_manufacturer(mfr) {
        mfr = tolower(mfr)
        if (mfr == "google") return "Google"
        if (mfr == "samsung") return "Samsung"
        if (mfr == "xiaomi" || mfr == "redmi") return "Xiaomi"
        if (mfr == "oneplus") return "OnePlus"
        if (mfr == "huawei") return "Huawei"
        if (mfr == "oppo") return "Oppo"
        if (mfr == "vivo") return "Vivo"
        if (mfr == "motorola") return "Motorola"
        if (mfr == "lg") return "LG"
        if (mfr == "sony") return "Sony"
        if (mfr == "htc") return "HTC"
        if (mfr == "nokia") return "Nokia"
        if (mfr == "honor") return "Honor"
        if (mfr == "realme") return "Realme"

        # Title case and clean
        gsub(/[^a-zA-Z0-9]/, "", mfr)
        mfr = toupper(substr(mfr, 1, 1)) tolower(substr(mfr, 2))
        if (match(mfr, /^[0-9]/)) mfr = "_" mfr
        return mfr
    }

    function sanitize_device_name(name) {
        # Convert to uppercase constant format
        gsub(/[^a-zA-Z0-9]/, "_", name)
        gsub(/_+/, "_", name)
        gsub(/^_|_$/, "", name)
        name = toupper(name)
        if (match(name, /^[0-9]/)) name = "_" name
        return name
    }
    ' > "$AGG_FILE"

    # Remove duplicates efficiently with sort/uniq
    sort "$AGG_FILE" | uniq > "$AGG_FILE.tmp" && mv "$AGG_FILE.tmp" "$AGG_FILE"

    local total_devices=$(wc -l < "$AGG_FILE" 2>/dev/null | tr -d ' ' || echo 0)
    log "Final result: $total_devices unique devices processed"
}

generate_manufacturer_extension() {
    local manufacturer="$1"
    local class_name=$(sanitize_class_name "$manufacturer")
    local file_path="$DEVICE_EXTENSIONS_DIR/${class_name}Devices.kt"

    # Use awk for fast duplicate handling and file generation
    grep "^${manufacturer}|" "$AGG_FILE" | sort -t'|' -k2,2 | awk -F'|' -v mfr="$manufacturer" -v class="$class_name" '
    BEGIN {
        print "package com.premex.compose.preview.devices"
        print ""
        print "import com.premex.compose.preview.Devices"
        print ""
        print "/**"
        print " * " mfr " device specifications for Android Compose previews."
        print " *"
        print " * This extension provides " mfr " device specifications that can be used with @Preview annotations"
        print " * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store."
        print " *"
        print " * Usage:"
        print " * \\`\\`\\`kotlin"
        print " * @Preview(device = Devices." class ".DEVICE_NAME)"
        print " * @Composable"
        print " * fun MyPreview() {"
        print " *     // Your composable content"
        print " * }"
        print " * \\`\\`\\`"
        print "*/"
        print "val Devices." class " get() = object {"

        device_counts[""] = 0  # Initialize associative array
        current_device = ""
        counter = 0
    }
    {
        device = $2; spec = $3; model = $4;

        # Handle duplicates by adding suffix
        if (device == current_device) {
            counter++
            final_name = device "_" counter
        } else {
            current_device = device
            counter = 1
            final_name = device
        }

        print "    /** " mfr " " model " */"
        print "    val " final_name " = \"" spec "\""
        print ""
    }
    END {
        print "}"
    }
    ' > "$file_path"

    local device_count=$(grep "^${manufacturer}|" "$AGG_FILE" | wc -l)

    log "Generated $device_count devices for $manufacturer in ${class_name}Devices.kt"
}

generate_devices_extensions() {
    local manufacturer="$1"
    local class_name=$(sanitize_class_name "$manufacturer")

    cat << EOF
    /**
     * $manufacturer devices from Android Device Catalog.
     * See ${class_name}Devices for complete specifications.
     */
    object $class_name : ${class_name}Devices()
EOF
}

update_devices_file() {
    log "Updating devices file with Android Device Catalog specifications..."

    fetch_android_catalog

    # Generate extension files for each manufacturer
    if [[ -s "$AGG_FILE" ]]; then
        local manufacturers
        manufacturers=$(cut -d'|' -f1 "$AGG_FILE" | sort -u)
        while IFS= read -r manufacturer; do
            [[ -z "$manufacturer" ]] && continue
            generate_manufacturer_extension "$manufacturer"
        done <<< "$manufacturers"
    fi

    # Create the updated main Devices.kt file
    cat > "$TEMP_DIR/Devices.kt" << 'EOF'
package com.premex.compose.preview

/**
 * Extended device specifications for Android Compose previews.
 * 
 * This object provides device specifications that can be used with @Preview annotations
 * in Android Compose, extending the built-in device list with devices from the Android
 * Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIXEL_8)
 * @Preview(device = Devices.Samsung.GALAXY_S24)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 *
 * NOTE: Device specifications are automatically generated from the Android Device Catalog:
 * https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv
 *
 * Run scripts/update-devices.sh to refresh with the latest catalog data.
 */
object Devices {
    const val DEFAULT = ""

    // Google Nexus Devices
    const val NEXUS_7 = "id:Nexus 7"
    const val NEXUS_7_2013 = "id:Nexus 7 2013"
    const val NEXUS_5 = "id:Nexus 5"
    const val NEXUS_6 = "id:Nexus 6"
    const val NEXUS_9 = "id:Nexus 9"
    const val NEXUS_10 = "name:Nexus 10"
    const val NEXUS_5X = "id:Nexus 5X"
    const val NEXUS_6P = "id:Nexus 6P"

    // Google Pixel Devices
    const val PIXEL_C = "id:pixel_c"
    const val PIXEL = "id:pixel"
    const val PIXEL_XL = "id:pixel_xl"
    const val PIXEL_2 = "id:pixel_2"
    const val PIXEL_2_XL = "id:pixel_2_xl"
    const val PIXEL_3 = "id:pixel_3"
    const val PIXEL_3_XL = "id:pixel_3_xl"
    const val PIXEL_3A = "id:pixel_3a"
    const val PIXEL_3A_XL = "id:pixel_3a_xl"
    const val PIXEL_4 = "id:pixel_4"
    const val PIXEL_4_XL = "id:pixel_4_xl"
    const val PIXEL_4A = "id:pixel_4a"
    const val PIXEL_5 = "id:pixel_5"
    const val PIXEL_6 = "id:pixel_6"
    const val PIXEL_6_PRO = "id:pixel_6_pro"
    const val PIXEL_6A = "id:pixel_6a"
    const val PIXEL_7 = "id:pixel_7"
    const val PIXEL_7_PRO = "id:pixel_7_pro"
    const val PIXEL_7A = "id:pixel_7a"
    const val PIXEL_8 = "id:pixel_8"
    const val PIXEL_8_PRO = "id:pixel_8_pro"
    const val PIXEL_8A = "id:pixel_8a"
    const val PIXEL_9 = "id:pixel_9"
    const val PIXEL_9_PRO = "id:pixel_9_pro"
    const val PIXEL_9_PRO_FOLD = "id:pixel_9_pro_fold"
    const val PIXEL_9_PRO_XL = "id:pixel_9_pro_xl"
    const val PIXEL_FOLD = "id:pixel_fold"
    const val PIXEL_TABLET = "id:pixel_tablet"

    // Automotive
    const val AUTOMOTIVE_1024p = "id:automotive_1024p_landscape"
}
EOF

    # Replace the original file
    cp "$TEMP_DIR/Devices.kt" "$DEVICES_FILE"

    log "Devices file updated successfully!"
}

validate_update() {
    log "Validating the updated devices file..."
    cd "$PROJECT_DIR"
    if ./gradlew build --quiet; then
        log "✅ Build successful - updated devices file is valid!"
        return 0
    else
        error "❌ Build failed - reverting changes..."
        return 1
    fi
}

show_summary() {
    if [[ -f "$AGG_FILE" ]]; then
        local manufacturers total
        manufacturers=$(cut -d'|' -f1 "$AGG_FILE" | sort -u | wc -l | tr -d ' ')
        total=$(wc -l < "$AGG_FILE" | tr -d ' ' || echo 0)

        log "Update Summary (from Android Device Catalog CSV):"
        echo "  • Total manufacturers: $manufacturers"
        echo "  • Total devices: $total"

        # Show top manufacturers by device count
        echo "  • Manufacturers and device counts:"
        cut -d'|' -f1 "$AGG_FILE" | sort | uniq -c | sort -rn | while read count manufacturer; do
            echo "    - $manufacturer: $count devices"
        done

        # Show generated files
        echo "  • Generated extension files:"
        if [[ -d "$DEVICE_EXTENSIONS_DIR" ]]; then
            ls -1 "$DEVICE_EXTENSIONS_DIR"/*.kt 2>/dev/null | while read file; do
                echo "    - ${file##*/}"
            done || echo "    (No extension files generated)"
        fi
    else
        warn "No aggregated device file present."
    fi
}

main() {
    log "Starting Android Compose Preview device update from Android Device Catalog CSV..."

    if [[ ! -f "$DEVICES_FILE" ]]; then
        error "Devices.kt file not found at: $DEVICES_FILE"
        exit 1
    fi

    create_backup
    update_devices_file
    show_summary

    if validate_update; then
        log "🎉 Device update completed successfully!"
        log "Run 'git diff' to see the changes made."
    else
        latest_backup=$(ls -t "$BACKUP_DIR"/Devices.kt.* | head -1)
        cp "$latest_backup" "$DEVICES_FILE"
        # Also restore device extensions if backup exists
        latest_devices_backup=$(ls -t "$BACKUP_DIR"/devices.* 2>/dev/null | head -1 || true)
        if [[ -n "$latest_devices_backup" ]]; then
            rm -rf "$DEVICE_EXTENSIONS_DIR"
            cp -r "$latest_devices_backup" "$DEVICE_EXTENSIONS_DIR" 2>/dev/null || true
        fi
        error "Update failed and has been reverted."
        exit 1
    fi
}

# Parse command line arguments
case "${1:-}" in
    --dry-run)
        log "Running in dry-run mode - no files will be modified"
        DRY_RUN=1
        ;;
    --fast)
        log "Running in fast mode with minimal output"
        FAST_MODE=1
        DRY_RUN=1
        ;;
    --help|-h)
        echo "Usage: $0 [--dry-run] [--fast] [--help]"
        echo ""
        echo "Updates device specifications from Android Device Catalog CSV"
        echo ""
        echo "Options:"
        echo "  --dry-run    Show what would be updated without making changes"
        echo "  --fast       Fast test mode with minimal output"
        echo "  --help, -h   Show this help message"
        exit 0
        ;;
esac

if [[ "${DRY_RUN:-}" == "1" ]]; then
    if [[ "${FAST_MODE:-}" == "1" ]]; then
        log "Fast test mode - timing CSV processing only..."
        start_time=$(date +%s)
        ensure_temp
        fetch_android_catalog >/dev/null 2>&1
        end_time=$(date +%s)
        duration=$((end_time - start_time))
        log "⚡ Fast CSV processing completed in ${duration}s"
        show_summary
    else
        log "Dry run mode - fetching and processing catalog without updating files..."
        ensure_temp
        fetch_android_catalog
        show_summary
    fi
else
    main
fi
