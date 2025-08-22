# ETERNITY Devices

This document lists all Eternity device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Eternity
- **Usage**: `Devices.Eternity.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Eternity.HEROSP001)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`HEROSP001`** - Herosp001 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`UWS68`** - Uws68 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
