# FAIRPHONE Devices

This document lists all Fairphone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Fairphone
- **Usage**: `Devices.Fairphone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fairphone.FP2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`FP2`** - Fp2 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=440
  ```

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`FP3`** - Fp3 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=420
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`FP4`** - Fp4 | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=400
  ```

### 1116x2484 (XXL)

**Screen specs**: 1116x2484px | **Aspect ratio**: 31:69

- **`FP6`** - Fp6 | **DPI**: 480
  ```kotlin
  spec:width=1116,height=2484,unit=px,dpi=480
  ```

### 1224x2700 (XXL)

**Screen specs**: 1224x2700px | **Aspect ratio**: 34:75

- **`FP5`** - Fp5 | **DPI**: 480
  ```kotlin
  spec:width=1224,height=2700,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
