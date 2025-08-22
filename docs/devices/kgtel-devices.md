# KGTEL Devices

This document lists all Kgtel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Kgtel
- **Usage**: `Devices.Kgtel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kgtel.A56)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`A56`** - A56 | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

- **`BETTER10`** - Better10 | **DPI**: 216
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=216
  ```

- **`X55E`** - X55e | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`R10A`** - R10a | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

- **`X5A`** - X5a | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`HELLO_10_PRO_4G`** - Hello 10 Pro 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`MATE20_PRO_4G`** - Mate20 Pro 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`NOVA_10_PRO_4G`** - Nova 10 Pro 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
