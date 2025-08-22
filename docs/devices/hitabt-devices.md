# HITABT Devices

This document lists all Hitabt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Hitabt
- **Usage**: `Devices.Hitabt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hitabt.K30A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`K30A`** - K30a | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`P30A`** - P30a | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`T30A_SY07PC01`** - T30a Sy07pc01 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
