# ZOOMSMART Devices

This document lists all Zoomsmart device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Zoomsmart
- **Usage**: `Devices.Zoomsmart.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zoomsmart.LT600T)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`LT600T`** - Lt600t | **DPI**: 360
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=360
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`LT800`** - Lt800 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`ZM800`** - Zm800 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
