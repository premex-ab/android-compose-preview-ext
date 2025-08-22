# LESIA Devices

This document lists all Lesia device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Lesia
- **Usage**: `Devices.Lesia.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lesia.C5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`C5`** - C5 | **DPI**: 198
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=198
  ```

- **`K2S`** - K2s | **DPI**: 198
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=198
  ```

- **`K6`** - K6 | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`SMART_7`** - Smart 7 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`HOT_30`** - Hot 30 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`NEO_9`** - Neo 9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
