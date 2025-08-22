# BLACKFOX Devices

This document lists all BlackFox device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: BlackFox
- **Usage**: `Devices.Blackfox.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Blackfox.BMM431B)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`BMM531D`** - Bmm531d | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`BMM543S`** - Bmm543s | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`BMM431S`** - Bmm431s | **DPI**: 300
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=300
  ```

- **`BMM531S`** - Bmm531s | **DPI**: 300
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=300
  ```

- **`BMM532D`** - Bmm532d | **DPI**: 300
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=300
  ```

- **`BMM541W`** - Bmm541w | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`BMM441A`** - Bmm441a | **DPI**: 300
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=300
  ```

- **`BMM441S`** - Bmm441s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`BMM431B`** - Bmm431b | **DPI**: 300
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
