# MARCEL Devices

This document lists all Marcel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Marcel
- **Usage**: `Devices.Marcel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Marcel.GUANDU)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`GUANDU`** - Guandu | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`YEONGDEUNGPO`** - Yeongdeungpo | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MARTIN`** - Martin | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`TAMACHI`** - Tamachi | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`ORBITM20`** - Orbitm20 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
