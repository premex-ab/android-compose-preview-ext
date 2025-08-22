# OKAPI Devices

This document lists all Okapi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Okapi
- **Usage**: `Devices.Okapi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Okapi.OKAPI10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`OKAPI_TAB8`** - Okapi Tab8 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 480x996 (Medium)

**Screen specs**: 480x996px | **Aspect ratio**: 40:83

- **`OKAPI10`** - Okapi10 | **DPI**: 213
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=213
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`OKAPI10_PRO`** - Okapi10 Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`OKAPI10_S`** - Okapi10 S | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`OKAPI10_PRO_MAX`** - Okapi10 Pro Max | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`OKAPI_TAB8_PRO`** - Okapi Tab8 Pro | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
