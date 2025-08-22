# CIBER Devices

This document lists all Ciber device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ciber
- **Usage**: `Devices.Ciber.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ciber.B610A103A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`B610A115`** - B610a115 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`B610A215`** - B610a215 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`B610A103A`** - B610a103a | **DPI**: 204
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=204
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
