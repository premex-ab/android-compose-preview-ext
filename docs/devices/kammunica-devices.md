# KAMMUNICA Devices

This document lists all Kammunica device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Kammunica
- **Usage**: `Devices.Kammunica.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kammunica.KAMMUNICA_500V)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`KAMMUNICA_500V`** - Kammunica 500v | **DPI**: 205
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=205
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KAMMUNICA_800`** - Kammunica 800 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`KAMMUNICA_XD`** - Kammunica Xd | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
