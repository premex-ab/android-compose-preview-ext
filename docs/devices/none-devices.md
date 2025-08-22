# NONE Devices

This document lists all NOne device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: NOne
- **Usage**: `Devices.None.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.None.NPADAIR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`NPADPLUS`** - Npadplus | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

- **`NPAD_ULTRA`** - Npad Ultra | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`TAB005`** - Tab005 | **DPI**: 213
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=213
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`NPADAIR`** - Npadair | **DPI**: 210
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=210
  ```

- **`NPADQ`** - Npadq | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`NPADS`** - Npads | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`NPADY`** - Npady | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`NPADY1`** - Npady1 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
