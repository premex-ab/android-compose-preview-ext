# MOBICEL Devices

This document lists all Mobicel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Mobicel
- **Usage**: `Devices.Mobicel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mobicel.COSMO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`COSMO`** - Cosmo | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

- **`ECHO`** - Echo | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`FEVER`** - Fever | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
