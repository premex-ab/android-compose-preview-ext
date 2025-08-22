# TCT Devices

This document lists all Tct device specifications available for Android Compose previews.

## Overview

- **Total devices**: 15
- **Manufacturer**: Tct
- **Usage**: `Devices.Tct.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tct.ALPHA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DIABLOXPLUS`** - Diabloxplus | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`SCRIBEPRO`** - Scribepro | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 320x480 (Micro)

**Screen specs**: 320x480px | **Aspect ratio**: 2:3

- **`BEETLE_GSM`** - Beetle Gsm | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

- **`VODAFONE_875`** - Vodafone 875 | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

- **`YARIS35_GSM`** - Yaris35 Gsm | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MEGANE_GSM`** - Megane Gsm | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

- **`YARIS_M_GSM`** - Yaris M Gsm | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`CALIFORNIA`** - California | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`YARISL_GSM`** - Yarisl Gsm | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`YARISXL`** - Yarisxl | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`DIABLO`** - Diablo | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

- **`RAV4`** - Rav4 | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

- **`YARIS_55`** - Yaris 55 | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`POP7`** - Pop7 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`ALPHA`** - Alpha | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
