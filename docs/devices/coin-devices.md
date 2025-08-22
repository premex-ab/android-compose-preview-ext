# COIN Devices

This document lists all Coin device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Coin
- **Usage**: `Devices.Coin.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Coin._1100AS_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`_1100AS_PLUS`** -  1100as Plus | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`_1200AS`** -  1200as | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`_1200AS_PLUS`** -  1200as Plus | **DPI**: 210
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=210
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
