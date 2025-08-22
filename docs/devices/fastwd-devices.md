# FASTWD Devices

This document lists all Fastwd device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Fastwd
- **Usage**: `Devices.Fastwd.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fastwd.L231)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`M109_EEA`** - M109 Eea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`L251_EEA`** - L251 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`L231`** - L231 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`L231_EEA`** - L231 Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`M20L`** - M20l | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`M518_EEA`** - M518 Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
