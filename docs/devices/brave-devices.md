# BRAVE Devices

This document lists all Brave device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Brave
- **Usage**: `Devices.Brave.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Brave.BT7X1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`BTSL1`** - Btsl1 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`BT7X1`** - Bt7x1 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BT8X1`** - Bt8x1 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`BTXS1`** - Btxs1 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`EXCEED`** - Exceed | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
