# YOBANSE Devices

This document lists all Yobanse device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Yobanse
- **Usage**: `Devices.Yobanse.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Yobanse.T88)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`T88`** - T88 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`Y101`** - Y101 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`Z_T10`** - Z T10 | **DPI**: 190
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=190
  ```

- **`Z_TAB10`** - Z Tab10 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
