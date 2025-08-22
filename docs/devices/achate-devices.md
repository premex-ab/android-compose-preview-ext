# ACHATE Devices

This document lists all Achate device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Achate
- **Usage**: `Devices.Achate.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Achate.KIDSTAB1_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KIDSTAB1_EEA`** - Kidstab1 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`KIDSTAB3_EEA`** - Kidstab3 Eea | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

- **`KIDS_TAB_2`** - Kids Tab 2 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
