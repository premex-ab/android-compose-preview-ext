# WINGS Devices

This document lists all Wings device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Wings
- **Usage**: `Devices.Wings.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wings.W1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2280 (XXL)

**Screen specs**: 1080x2280px | **Aspect ratio**: 9:19

- **`W6`** - W6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2280,unit=px,dpi=480
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`W7`** - W7 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

- **`WX`** - Wx | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`W3`** - W3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`W1`** - W1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
