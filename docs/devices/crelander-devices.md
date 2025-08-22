# CRELANDER Devices

This document lists all Crelander device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Crelander
- **Usage**: `Devices.Crelander.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Crelander.A101)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`A101`** - A101 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`T118`** - T118 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`W30`** - W30 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`Z103`** - Z103 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
