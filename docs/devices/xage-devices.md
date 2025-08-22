# XAGE Devices

This document lists all XAge device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: XAge
- **Usage**: `Devices.Xage.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xage.A1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`A1`** - A1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`G2`** - G2 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`ACE`** - Ace | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`G1LITE`** - G1lite | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`G1`** - G1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`X_AGE_LEAP_1`** - X Age Leap 1 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=300
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`X_AGE_SNAP_1`** - X Age Snap 1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
