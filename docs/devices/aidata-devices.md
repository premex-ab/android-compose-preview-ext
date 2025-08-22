# AIDATA Devices

This document lists all Aidata device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Aidata
- **Usage**: `Devices.Aidata.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Aidata.ADT1012L)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`ADT1061`** - Adt1061 | **DPI**: 213
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=213
  ```

- **`ADT1061_1`** - Adt1061 1 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`ADT_1061`** - Adt 1061 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`ADT_R10TME`** - Adt R10tme | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ADT1012L`** - Adt1012l | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
