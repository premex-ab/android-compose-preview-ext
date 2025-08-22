#!/bin/bash

# Device Update Script for Android Compose Preview Extensions
# This script updates the device specifications in the Devices.kt file
# by fetching latest device information from various sources.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(cd "$SCRIPT_DIR/.." && pwd)"
DEVICES_FILE="$PROJECT_DIR/library/src/main/kotlin/com/premex/compose/preview/Devices.kt"
TEMP_DIR="/tmp/device-updater-$$"
BACKUP_DIR="$PROJECT_DIR/.device-backups"

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
}

# Device specification data (manually curated with latest info)
declare -A ZEBRA_DEVICES=(
    ["TC21"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["TC26"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["TC27"]="spec:width=1080,height=2160,unit=px,dpi=402"
    ["TC52"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["TC56"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["TC57"]="spec:width=1080,height=1920,unit=px,dpi=441"
    ["TC58"]="spec:width=1080,height=1920,unit=px,dpi=441"
    ["TC72"]="spec:width=720,height=1280,unit=px,dpi=312"
    ["TC75"]="spec:width=720,height=1280,unit=px,dpi=312"
    ["TC77"]="spec:width=1080,height=1920,unit=px,dpi=469"
    ["TC78"]="spec:width=1080,height=1920,unit=px,dpi=469"
    ["ET40"]="spec:width=800,height=1280,unit=px,dpi=216"
    ["ET45"]="spec:width=800,height=1280,unit=px,dpi=216"
    ["MC18"]="spec:width=480,height=800,unit=px,dpi=233"
    ["MC33"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["MC93"]="spec:width=800,height=480,unit=px,dpi=216"
    ["WT6000"]="spec:width=480,height=272,unit=px,dpi=188"
)

declare -A SAMSUNG_DEVICES=(
    ["GALAXY_S24"]="spec:width=1080,height=2340,unit=px,dpi=416"
    ["GALAXY_S24_PLUS"]="spec:width=1080,height=2340,unit=px,dpi=393"
    ["GALAXY_S24_ULTRA"]="spec:width=1440,height=3120,unit=px,dpi=505"
    ["GALAXY_S23"]="spec:width=1080,height=2340,unit=px,dpi=425"
    ["GALAXY_S23_PLUS"]="spec:width=1080,height=2340,unit=px,dpi=393"
    ["GALAXY_S23_ULTRA"]="spec:width=1440,height=3088,unit=px,dpi=500"
    ["GALAXY_TAB_S9"]="spec:width=1600,height=2560,unit=px,dpi=274"
    ["GALAXY_TAB_S9_PLUS"]="spec:width=1752,height=2800,unit=px,dpi=266"
    ["GALAXY_TAB_S9_ULTRA"]="spec:width=1848,height=2960,unit=px,dpi=240"
    ["GALAXY_A54"]="spec:width=1080,height=2340,unit=px,dpi=403"
    ["GALAXY_A34"]="spec:width=1080,height=2340,unit=px,dpi=390"
)

declare -A HONEYWELL_DEVICES=(
    ["CT30_XP"]="spec:width=480,height=800,unit=px,dpi=233"
    ["CT40"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["CT45"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["CT45_XP"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["CT60"]="spec:width=720,height=1280,unit=px,dpi=312"
    ["CT60_XP"]="spec:width=720,height=1280,unit=px,dpi=312"
    ["EDA52"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["EDA57"]="spec:width=1080,height=1920,unit=px,dpi=441"
    ["EDA70"]="spec:width=800,height=1280,unit=px,dpi=216"
    ["ScanPal_EDA60K"]="spec:width=720,height=1280,unit=px,dpi=312"
)

declare -A DATALOGIC_DEVICES=(
    ["MEMOR_1"]="spec:width=480,height=800,unit=px,dpi=233"
    ["MEMOR_10"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["MEMOR_11"]="spec:width=1080,height=1920,unit=px,dpi=441"
    ["MEMOR_20"]="spec:width=720,height=1280,unit=px,dpi=294"
    ["MEMOR_35"]="spec:width=800,height=1280,unit=px,dpi=216"
    ["SKORPIO_X5"]="spec:width=800,height=480,unit=px,dpi=216"
    ["JOYA_TOUCH_A6"]="spec:width=480,height=800,unit=px,dpi=233"
)

generate_device_section() {
    local manufacturer="$1"
    local -n devices_ref=$2
    
    echo "    /**"
    echo "     * $manufacturer devices."
    case "$manufacturer" in
        "Zebra")
            echo "     * Professional mobile computers and rugged devices."
            ;;
        "Samsung")
            echo "     * Popular consumer and enterprise Android devices."
            ;;
        "Honeywell")
            echo "     * Enterprise mobility and data collection devices."
            ;;
        "Datalogic")
            echo "     * Professional data capture and industrial automation devices."
            ;;
    esac
    echo "     */"
    echo "    object $manufacturer {"
    
    for device_name in $(printf '%s\n' "${!devices_ref[@]}" | sort); do
        spec="${devices_ref[$device_name]}"
        echo "        /** $manufacturer $device_name - Device specification */"
        echo "        const val $device_name = \"$spec\""
        echo ""
    done
    
    echo "    }"
}

update_devices_file() {
    log "Updating devices file with latest specifications..."
    
    mkdir -p "$TEMP_DIR"
    
    # Create the updated file
    cat > "$TEMP_DIR/Devices.kt" << 'EOF'
package com.premex.compose.preview

/**
 * Extended device specifications for Android Compose previews.
 * 
 * This object provides device specifications that can be used with @Preview annotations
 * in Android Compose, extending the built-in device list with third-party manufacturer devices.
 * 
 * Usage:
 * ```
 * @Preview(device = Devices.PIXEL_8)
 * @Preview(device = Devices.Zebra.TC26)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
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

EOF

    # Add manufacturer sections
    generate_device_section "Zebra" ZEBRA_DEVICES >> "$TEMP_DIR/Devices.kt"
    echo "" >> "$TEMP_DIR/Devices.kt"
    generate_device_section "Samsung" SAMSUNG_DEVICES >> "$TEMP_DIR/Devices.kt"
    echo "" >> "$TEMP_DIR/Devices.kt"
    generate_device_section "Honeywell" HONEYWELL_DEVICES >> "$TEMP_DIR/Devices.kt"
    echo "" >> "$TEMP_DIR/Devices.kt"
    generate_device_section "Datalogic" DATALOGIC_DEVICES >> "$TEMP_DIR/Devices.kt"
    
    # Close the main object
    echo "}" >> "$TEMP_DIR/Devices.kt"
    
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
    log "Update Summary:"
    echo "  • Zebra devices: ${#ZEBRA_DEVICES[@]}"
    echo "  • Samsung devices: ${#SAMSUNG_DEVICES[@]}"
    echo "  • Honeywell devices: ${#HONEYWELL_DEVICES[@]}"
    echo "  • Datalogic devices: ${#DATALOGIC_DEVICES[@]}"
    echo "  • Total new/updated devices: $((${#ZEBRA_DEVICES[@]} + ${#SAMSUNG_DEVICES[@]} + ${#HONEYWELL_DEVICES[@]} + ${#DATALOGIC_DEVICES[@]}))"
}

main() {
    log "Starting Android Compose Preview device update process..."
    
    if [[ ! -f "$DEVICES_FILE" ]]; then
        error "Devices.kt file not found at: $DEVICES_FILE"
        exit 1
    fi
    
    create_backup
    
    show_summary
    
    update_devices_file
    
    if validate_update; then
        log "🎉 Device update completed successfully!"
        log "Run 'git diff' to see the changes made."
    else
        # Restore from backup
        latest_backup=$(ls -t "$BACKUP_DIR"/Devices.kt.* | head -1)
        cp "$latest_backup" "$DEVICES_FILE"
        error "Update failed and has been reverted."
        exit 1
    fi
}

# Handle command line arguments
case "${1:-}" in
    --help|-h)
        echo "Usage: $0 [--help|--dry-run|--force]"
        echo ""
        echo "Options:"
        echo "  --help, -h     Show this help message"
        echo "  --dry-run      Show what would be updated without making changes"
        echo "  --force        Skip validation and force update"
        echo ""
        echo "Environment variables:"
        echo "  DEBUG=1        Enable debug logging"
        exit 0
        ;;
    --dry-run)
        log "Dry run mode - showing what would be updated:"
        show_summary
        exit 0
        ;;
    --force)
        log "Force mode - skipping validation"
        create_backup
        update_devices_file
        log "🎉 Device update completed (validation skipped)!"
        exit 0
        ;;
    "")
        main
        ;;
    *)
        error "Unknown option: $1"
        echo "Use --help for usage information"
        exit 1
        ;;
esac