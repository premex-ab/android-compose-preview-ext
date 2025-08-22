# VOLVOCARS Devices

This document lists all Volvocars device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Volvocars
- **Usage**: `Devices.Volvocars.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Volvocars.HABANERO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1600 (XL)

**Screen specs**: 1200x1600px | **Aspect ratio**: 3:4

- **`HABANERO`** - Habanero | **DPI**: 180
  ```kotlin
  spec:width=1200,height=1600,unit=px,dpi=180
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`MOOSE`** - Moose | **DPI**: 200
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=200
  ```

### 768x1024 (Medium)

**Screen specs**: 768x1024px | **Aspect ratio**: 3:4

- **`IHU_ABL_CAR`** - Ihu Abl Car | **DPI**: 140
  ```kotlin
  spec:width=768,height=1024,unit=px,dpi=140
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
