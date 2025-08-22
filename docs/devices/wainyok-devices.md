# WAINYOK Devices

This document lists all Wainyok device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Wainyok
- **Usage**: `Devices.Wainyok.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wainyok.P10S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`P10S`** - P10s | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`P10X`** - P10x | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
