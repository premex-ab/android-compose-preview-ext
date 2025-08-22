# VIKUSHA Devices

This document lists all Vikusha device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Vikusha
- **Usage**: `Devices.Vikusha.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vikusha.VZ_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`V_N5`** - V N5 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`V_Z70`** - V Z70 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`V_Z80PLUS`** - V Z80plus | **DPI**: 252
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=252
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`VZ_1`** - Vz 1 | **DPI**: 200
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=200
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`VZ_30`** - Vz 30 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`VZ_30PRO`** - Vz 30pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`V_E5`** - V E5 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`V_Z40`** - V Z40 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`V_Z40PRO`** - V Z40pro | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
