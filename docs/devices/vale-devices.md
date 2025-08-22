# VALE Devices

This document lists all Vale device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Vale
- **Usage**: `Devices.Vale.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vale.V10A_4128)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`V11E_LTE_4128`** - V11e Lte 4128 | **DPI**: 200
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=200
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`V12E_LTE`** - V12e Lte | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`V12E_LTE_8128`** - V12e Lte 8128 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`V10A_4128`** - V10a 4128 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`V10E_LTE`** - V10e Lte | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
