# PRODVX Devices

This document lists all Prodvx device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Prodvx
- **Usage**: `Devices.Prodvx.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Prodvx.RK3399_ANDROID11)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`RK3399_ANDROID11`** - Rk3399 Android11 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
