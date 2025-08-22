# LAVIETAB Devices

This document lists all Lavietab device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Lavietab
- **Usage**: `Devices.Lavietab.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lavietab.PC_TE307N1W)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`PC_TE510BAL`** - Pc Te510bal | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 600x976 (Medium)

**Screen specs**: 600x976px | **Aspect ratio**: 75:122

- **`PC_TE307N1W`** - Pc Te307n1w | **DPI**: 160
  ```kotlin
  spec:width=600,height=976,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TE508BAW`** - Te508baw | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
