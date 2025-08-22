# OCTOPUS Devices

This document lists all Octopus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Octopus
- **Usage**: `Devices.Octopus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Octopus.OCTOPUS_ONE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`OCTOPUS_ONE`** - Octopus One | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
