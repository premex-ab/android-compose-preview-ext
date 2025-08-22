# GTAB Devices

This document lists all GTab device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: GTab
- **Usage**: `Devices.Gtab.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gtab.F10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`Q5`** - Q5 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`F10`** - F10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`S3`** - S3 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`TABLET`** - Tablet | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
