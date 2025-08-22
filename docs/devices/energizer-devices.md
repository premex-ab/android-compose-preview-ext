# ENERGIZER Devices

This document lists all Energizer device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Energizer
- **Usage**: `Devices.Energizer.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Energizer.ENERGYE500)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`POWERMAXP600S`** - Powermaxp600s | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2244 (XXL)

**Screen specs**: 1080x2244px | **Aspect ratio**: 90:187

- **`ULTIMATE_U710S`** - Ultimate U710s | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2244,unit=px,dpi=480
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`ENERGYE500`** - Energye500 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`ENERGYE500S_EU`** - Energye500s Eu | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`POWERMAXP490`** - Powermaxp490 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`POWERMAXP490S_AP`** - Powermaxp490s Ap | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`POWERMAXP490S_EU`** - Powermaxp490s Eu | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`HARDCASEH500S`** - Hardcaseh500s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
