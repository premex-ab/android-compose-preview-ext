# IKALL Devices

This document lists all IKall device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: IKall
- **Usage**: `Devices.Ikall.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ikall.K510)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`S3`** - S3 | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=400
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`K510`** - K510 | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`Z19`** - Z19 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`Z20`** - Z20 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
