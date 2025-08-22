# EL Devices

This document lists all El device specifications available for Android Compose previews.

## Overview

- **Total devices**: 11
- **Manufacturer**: El
- **Usage**: `Devices.El.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.El.D60_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`PAD_S8`** - Pad S8 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 240x296 (Micro)

**Screen specs**: 240x296px | **Aspect ratio**: 30:37

- **`_6CS`** -  6cs | **DPI**: 120
  ```kotlin
  spec:width=240,height=296,unit=px,dpi=120
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`_6AT`** -  6at | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`D60_PRO`** - D60 Pro | **DPI**: 315
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=315
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`Y10`** - Y10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`D68`** - D68 | **DPI**: 380
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=380
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`X60_PRO`** - X60 Pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

- **`X70`** - X70 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`X80`** - X80 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`PAD_S11`** - Pad S11 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`PAD_S7`** - Pad S7 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
