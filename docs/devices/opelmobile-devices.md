# OPELMOBILE Devices

This document lists all Opelmobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Opelmobile
- **Usage**: `Devices.Opelmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Opelmobile.OMR60Q23O)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`OMR60Q23O`** - Omr60q23o | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`OMS60R24B`** - Oms60r24b | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

- **`SMART55R`** - Smart55r | **DPI**: 220
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=220
  ```

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`OPELMOBILE_OMSJ523B`** - Opelmobile Omsj523b | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SMARTJX`** - Smartjx | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`SMARTX1`** - Smartx1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
