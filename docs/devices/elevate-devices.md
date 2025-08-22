# ELEVATE Devices

This document lists all Elevate device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Elevate
- **Usage**: `Devices.Elevate.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Elevate.G5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`V55C`** - V55c | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2246 (XXL)

**Screen specs**: 1080x2246px | **Aspect ratio**: 540:1123

- **`G60X`** - G60x | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2246,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`G55_LITE`** - G55 Lite | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`G60`** - G60 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`V55`** - V55 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`V57`** - V57 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`G62`** - G62 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`G58`** - G58 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`G5`** - G5 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

- **`LUNA_G50`** - Luna G50 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
