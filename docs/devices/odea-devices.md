# ODEA Devices

This document lists all Odea device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Odea
- **Usage**: `Devices.Odea.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Odea.A10_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`S11_EEA`** - S11 Eea | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`S11_ROW`** - S11 Row | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`A12_ROW`** - A12 Row | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`A10_EEA`** - A10 Eea | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`A10_ROW`** - A10 Row | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`A11_ROW`** - A11 Row | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
