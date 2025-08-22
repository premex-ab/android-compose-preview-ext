# TJD Devices

This document lists all Tjd device specifications available for Android Compose previews.

## Overview

- **Total devices**: 12
- **Manufacturer**: Tjd
- **Usage**: `Devices.Tjd.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tjd.MT_1011)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1440 (Large)

**Screen specs**: 1080x1440px | **Aspect ratio**: 3:4

- **`MT_750QR`** - Mt 750qr | **DPI**: 280
  ```kotlin
  spec:width=1080,height=1440,unit=px,dpi=280
  ```

- **`MT_750QU`** - Mt 750qu | **DPI**: 213
  ```kotlin
  spec:width=1080,height=1440,unit=px,dpi=213
  ```

### 1536x2048 (XL)

**Screen specs**: 1536x2048px | **Aspect ratio**: 3:4

- **`MT_790QR_V1`** - Mt 790qr V1 | **DPI**: 320
  ```kotlin
  spec:width=1536,height=2048,unit=px,dpi=320
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`MT_710QF`** - Mt 710qf | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

- **`MT_710QU`** - Mt 710qu | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`MT_717QW`** - Mt 717qw | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MT_1011`** - Mt 1011 | **DPI**: 210
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=210
  ```

- **`MT_1011OF`** - Mt 1011of | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`MT_1011QR`** - Mt 1011qr | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`MT_1025QU`** - Mt 1025qu | **DPI**: 186
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=186
  ```

- **`MT_710QU_PRO`** - Mt 710qu Pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`MT_761QU_PRO`** - Mt 761qu Pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
