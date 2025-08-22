# EMPORIA Devices

This document lists all Emporia device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Emporia
- **Usage**: `Devices.Emporia.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Emporia.E5MINI)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2408 (XXL)

**Screen specs**: 1080x2408px | **Aspect ratio**: 135:301

- **`E6`** - E6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2408,unit=px,dpi=480
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`TAB1`** - Tab1 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`E5MINI`** - E5mini | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`S3MINI`** - S3mini | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`S4`** - S4 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`SE`** - Se | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`E6MINI`** - E6mini | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`E7LT`** - E7lt | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`S3`** - S3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`S5`** - S5 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
