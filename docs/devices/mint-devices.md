# MINT Devices

This document lists all Mint device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Mint
- **Usage**: `Devices.Mint.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mint.M5CR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 320x480 (Micro)

**Screen specs**: 320x480px | **Aspect ratio**: 2:3

- **`MINT_FOX`** - Mint Fox | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`M5CR`** - M5cr | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`PEARL_NEO`** - Pearl Neo | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`MINT_FUSION`** - Mint Fusion | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
