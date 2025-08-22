# SAFARICOM Devices

This document lists all Safaricom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Safaricom
- **Usage**: `Devices.Safaricom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Safaricom.NEON_LITE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`NEON_LITE`** - Neon Lite | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

- **`NEON_STORM`** - Neon Storm | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`NEON_RAY`** - Neon Ray | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

- **`NEON_RAY_2`** - Neon Ray 2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`NEON_SMARTA_2`** - Neon Smarta 2 | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

- **`SAFARICOM_ET_KIMEM`** - Safaricom Et Kimem | **DPI**: 213
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=213
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`NEON_RAY_PRO`** - Neon Ray Pro | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`NEON_NOVA`** - Neon Nova | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`NEON_ULTRA_2`** - Neon Ultra 2 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=300
  ```

- **`SAJIPRO`** - Sajipro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
