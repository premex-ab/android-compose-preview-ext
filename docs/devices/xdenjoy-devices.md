# XDENJOY Devices

This document lists all XdEnjoy device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: XdEnjoy
- **Usage**: `Devices.Xdenjoy.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xdenjoy.XDDGM10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`XDDGM10`** - Xddgm10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`XDDGM11BS`** - Xddgm11bs | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`XDDGM99PM`** - Xddgm99pm | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
