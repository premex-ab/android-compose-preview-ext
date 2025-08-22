# ENIE Devices

This document lists all Enie device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Enie
- **Usage**: `Devices.Enie.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Enie.E4PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`EH3`** - Eh3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`E4PRO`** - E4pro | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`ENIE_E2`** - Enie E2 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=300
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SKT119`** - Skt119 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`SKT706`** - Skt706 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`VT8216`** - Vt8216 | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
