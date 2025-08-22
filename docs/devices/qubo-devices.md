# QUBO Devices

This document lists all Qubo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 11
- **Manufacturer**: Qubo
- **Usage**: `Devices.Qubo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Qubo.BIG1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`BIG1`** - Big1 | **DPI**: 213
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=213
  ```

- **`X626`** - X626 | **DPI**: 213
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=213
  ```

- **`X626_4G`** - X626 4g | **DPI**: 213
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=213
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`SP510`** - Sp510 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`T3G_Q07`** - T3g Q07 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`P19`** - P19 | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`X668_32GB`** - X668 32gb | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`X668_64GB`** - X668 64gb | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`T104_64GB`** - T104 64gb | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`T10_32GB`** - T10 32gb | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`TKIDS_100_EEA`** - Tkids 100 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
