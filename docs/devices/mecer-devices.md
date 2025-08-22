# MECER Devices

This document lists all Mecer device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Mecer
- **Usage**: `Devices.Mecer.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mecer.M17QF6_3GPLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`M77QF6`** - M77qf6 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

- **`MF716`** - Mf716 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`M17QF6_3GPLUS`** - M17qf6 3gplus | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`TF10EA2_11`** - Tf10ea2 11 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`TF10MK1_3`** - Tf10mk1 3 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
