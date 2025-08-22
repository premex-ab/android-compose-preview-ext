# DAEWOO Devices

This document lists all Daewoo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Daewoo
- **Usage**: `Devices.Daewoo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Daewoo.DW_TN7RK16)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`DW_TN7RK16`** - Dw Tn7rk16 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SUNNYVALE`** - Sunnyvale | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`NEON`** - Neon | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
