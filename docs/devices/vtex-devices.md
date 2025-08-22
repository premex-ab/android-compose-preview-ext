# VTEX Devices

This document lists all Vtex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Vtex
- **Usage**: `Devices.Vtex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vtex.MT8768)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MT8768`** - Mt8768 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`VK102W`** - Vk102w | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`VK802W`** - Vk802w | **DPI**: 188
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=188
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
