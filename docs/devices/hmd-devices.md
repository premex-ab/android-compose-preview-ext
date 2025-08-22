# HMD Devices

This document lists all Hmd device specifications available for Android Compose previews.

## Overview

- **Total devices**: 14
- **Manufacturer**: Hmd
- **Usage**: `Devices.Hmd.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hmd.AGTAH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`ARP`** - Arp | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=400
  ```

- **`ARW`** - Arw | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=400
  ```

- **`SNT`** - Snt | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=400
  ```

- **`TCT`** - Tct | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=400
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`AGTAH`** - Agtah | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`AGTH`** - Agth | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 576x1280 (Large)

**Screen specs**: 576x1280px | **Aspect ratio**: 9:20

- **`CMT`** - Cmt | **DPI**: 213
  ```kotlin
  spec:width=576,height=1280,unit=px,dpi=213
  ```

- **`NYX`** - Nyx | **DPI**: 213
  ```kotlin
  spec:width=576,height=1280,unit=px,dpi=213
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`LGD`** - Lgd | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`LGP`** - Lgp | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`LGR`** - Lgr | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`NHK`** - Nhk | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`RCK`** - Rck | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`SHK`** - Shk | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
