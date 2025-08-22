# BYYBUO Devices

This document lists all Byybuo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Byybuo
- **Usage**: `Devices.Byybuo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Byybuo.BYYBUO_SMARTPAD_A10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`BYYBUO_SMARTPAD_T10`** - Byybuo Smartpad T10 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`SMARTPAD_T10_EU`** - Smartpad T10 Eu | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BYYBUO_SMARTPAD_A10`** - Byybuo Smartpad A10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
