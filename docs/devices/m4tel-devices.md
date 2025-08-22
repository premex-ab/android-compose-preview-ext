# M4TEL Devices

This document lists all M4tel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: M4tel
- **Usage**: `Devices.M4tel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.M4tel.DREAMPLUS02A_S10A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`DREAMPLUS02A_S10A`** - Dreamplus02a S10a | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`R2`** - R2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`R2_PLUS`** - R2 Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DREAMPLUS03A_S14A`** - Dreamplus03a S14a | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`NOVA03A_S22A`** - Nova03a S22a | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
