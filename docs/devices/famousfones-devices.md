# FAMOUSFONES Devices

This document lists all FamousFones device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: FamousFones
- **Usage**: `Devices.Famousfones.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Famousfones.FAMOUS_5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`FAMOUS_5`** - Famous 5 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`FAMOUS_5PLUS`** - Famous 5plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`RED_ROYAL_EDITION`** - Red Royal Edition | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1498 (XL)

**Screen specs**: 720x1498px | **Aspect ratio**: 360:749

- **`FAMOUS_RED_5PLUS`** - Famous Red 5plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1498,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`FAMOUS_TAB_10`** - Famous Tab 10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
