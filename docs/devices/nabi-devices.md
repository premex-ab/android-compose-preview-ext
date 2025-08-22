# NABI Devices

This document lists all Nabi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Nabi
- **Usage**: `Devices.Nabi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nabi.DMTAB_NV20A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DMTAB_NV24A`** - Dmtab Nv24a | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

### 552x1024 (Medium)

**Screen specs**: 552x1024px | **Aspect ratio**: 69:128

- **`MT799`** - Mt799 | **DPI**: 160
  ```kotlin
  spec:width=552,height=1024,unit=px,dpi=160
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`NBFP07PMKG`** - Nbfp07pmkg | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`NBTY07SMKG`** - Nbty07smkg | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`NABI2S`** - Nabi2s | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

### 900x1600 (XL)

**Screen specs**: 900x1600px | **Aspect ratio**: 9:16

- **`DMTAB_NV20A`** - Dmtab Nv20a | **DPI**: 213
  ```kotlin
  spec:width=900,height=1600,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
