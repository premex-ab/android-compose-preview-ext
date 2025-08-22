# LUNA Devices

This document lists all Luna device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Luna
- **Usage**: `Devices.Luna.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Luna.G6)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2248 (XXL)

**Screen specs**: 1080x2248px | **Aspect ratio**: 135:281

- **`LUNA_V6`** - Luna V6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2248,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`G6`** - G6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`LUNA_T10`** - Luna T10 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`G6E`** - G6e | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`LUNA_G9`** - Luna G9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`LUNA_V6_3GB`** - Luna V6 3gb | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
