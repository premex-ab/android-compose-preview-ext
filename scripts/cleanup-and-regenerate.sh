#!/bin/bash

# Clean up and regenerate device files script
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_DIR="$(cd "$SCRIPT_DIR/.." && pwd)"
DEVICES_EXTENSIONS_DIR="$PROJECT_DIR/library/src/main/kotlin/com/premex/compose/preview/devices"

echo "🧹 Cleaning up broken device extension files..."

# Remove all existing device extension files
if [[ -d "$DEVICES_EXTENSIONS_DIR" ]]; then
    rm -rf "$DEVICES_EXTENSIONS_DIR"
    echo "   Removed all device extension files"
fi

# Create the directory
mkdir -p "$DEVICES_EXTENSIONS_DIR"
echo "   Created clean devices directory"

echo "✅ Cleanup completed. Ready for regeneration."
echo ""
echo "Now run: ./scripts/update-devices.sh --dry-run"
echo "Then run: ./scripts/update-devices.sh"
