# VERTU Devices

This document lists all Vertu device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Vertu
- **Usage**: `Devices.Vertu.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vertu.ASTER_P)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`ASTER_P`** - Aster P | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`VTL_202101`** - Vtl 202101 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

- **`VTL_202201`** - Vtl 202201 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 1188x2790 (XXL)

**Screen specs**: 1188x2790px | **Aspect ratio**: 66:155

- **`VTL_202302`** - Vtl 202302 | **DPI**: 520
  ```kotlin
  spec:width=1188,height=2790,unit=px,dpi=520
  ```

### 1260x2800 (XXL)

**Screen specs**: 1260x2800px | **Aspect ratio**: 9:20

- **`VTL_202301`** - Vtl 202301 | **DPI**: 560
  ```kotlin
  spec:width=1260,height=2800,unit=px,dpi=560
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
