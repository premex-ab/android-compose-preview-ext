# ANDROID Devices

This document lists all Android device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Android
- **Usage**: `Devices.Android.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Android.NANOPC_T4)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`RK3328_BOX`** - Rk3328 Box | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

### 720x1200 (Large)

**Screen specs**: 720x1200px | **Aspect ratio**: 3:5

- **`NANOPC_T4`** - Nanopc T4 | **DPI**: 260
  ```kotlin
  spec:width=720,height=1200,unit=px,dpi=260
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`RK322X_BOX`** - Rk322x Box | **DPI**: 160
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
