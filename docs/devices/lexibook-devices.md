# LEXIBOOK Devices

This document lists all Lexibook device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Lexibook
- **Usage**: `Devices.Lexibook.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lexibook.LT10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MFS100`** - Mfs100 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`TL70`** - Tl70 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`LT10`** - Lt10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`LT10EN_09`** - Lt10en 09 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`LT10_01_EEA`** - Lt10 01 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`TLN10FR`** - Tln10fr | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
