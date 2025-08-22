# UNIWA Devices

This document lists all Uniwa device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Uniwa
- **Usage**: `Devices.Uniwa.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Uniwa.K626)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`K626`** - K626 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`UNIWA_W888`** - Uniwa W888 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

- **`UNIWA_W999`** - Uniwa W999 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`W555`** - W555 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`M101`** - M101 | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
