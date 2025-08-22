# BLACKBERRY Devices

This document lists all Blackberry device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Blackberry
- **Usage**: `Devices.Blackberry.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Blackberry.ARGON)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1620 (XL)

**Screen specs**: 1080x1620px | **Aspect ratio**: 2:3

- **`BBB100`** - Bbb100 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1620,unit=px,dpi=420
  ```

- **`BBE100`** - Bbe100 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1620,unit=px,dpi=420
  ```

- **`BBF100`** - Bbf100 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1620,unit=px,dpi=420
  ```

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`BBD100`** - Bbd100 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`HAMBURG`** - Hamburg | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`BBG100`** - Bbg100 | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=400
  ```

- **`BBH100`** - Bbh100 | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=400
  ```

### 1440x2560 (XXL)

**Screen specs**: 1440x2560px | **Aspect ratio**: 9:16

- **`ARGON`** - Argon | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

- **`VENICE`** - Venice | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`BBC100`** - Bbc100 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
