# VIEWSONIC Devices

This document lists all Viewsonic device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Viewsonic
- **Usage**: `Devices.Viewsonic.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Viewsonic.IFP34)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`VSD242`** - Vsd242 | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`IFP34`** - Ifp34 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`IFP51`** - Ifp51 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`IFP8652_2`** - Ifp8652 2 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`IN02_SERIES`** - In02 Series | **DPI**: 420
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=420
  ```

- **`VPC_A31_O1`** - Vpc A31 O1 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`MID7015_MK_32`** - Mid7015 Mk 32 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MID1016_MA`** - Mid1016 Ma | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`MID1032_MK`** - Mid1032 Mk | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
