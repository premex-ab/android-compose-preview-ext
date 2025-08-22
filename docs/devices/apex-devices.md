# APEX Devices

This document lists all Apex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Apex
- **Usage**: `Devices.Apex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Apex.APEX_P10HD_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`APEX_P10HD_PRO`** - Apex P10hd Pro | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`P10HD_LITE`** - P10hd Lite | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`U10`** - U10 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`U10PRO`** - U10pro | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`T40PRO_L1`** - T40pro L1 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`Z4PRO`** - Z4pro | **DPI**: 320
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=320
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`Z12_PRO`** - Z12 Pro | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`R10D`** - R10d | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
