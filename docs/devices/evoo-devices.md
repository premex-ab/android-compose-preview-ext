# EVOO Devices

This document lists all Evoo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Evoo
- **Usage**: `Devices.Evoo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Evoo.EVMFV2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`EV_A_133_1`** - Ev A 133 1 | **DPI**: 213
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=213
  ```

- **`EV_A_156_1`** - Ev A 156 1 | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`EV_A_116_1`** - Ev A 116 1 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`EVMFV2`** - Evmfv2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`EV_A_101_3`** - Ev A 101 3 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
