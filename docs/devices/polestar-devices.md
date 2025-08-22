# POLESTAR Devices

This document lists all Polestar device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Polestar
- **Usage**: `Devices.Polestar.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Polestar.IHU_ABL_CAR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1152x1536 (XL)

**Screen specs**: 1152x1536px | **Aspect ratio**: 3:4

- **`IHU_ABL_CAR`** - Ihu Abl Car | **DPI**: 180
  ```kotlin
  spec:width=1152,height=1536,unit=px,dpi=180
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`JALAPENO`** - Jalapeno | **DPI**: 140
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=140
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`MOOSE`** - Moose | **DPI**: 200
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
