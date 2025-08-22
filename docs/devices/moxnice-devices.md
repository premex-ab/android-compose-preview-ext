# MOXNICE Devices

This document lists all Moxnice device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Moxnice
- **Usage**: `Devices.Moxnice.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Moxnice.P50_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`P63`** - P63 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`P50_EEA`** - P50 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`P50_ROW`** - P50 Row | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
