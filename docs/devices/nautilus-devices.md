# NAUTILUS Devices

This document lists all Nautilus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Nautilus
- **Usage**: `Devices.Nautilus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nautilus.NFTM_LAR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`NFTM_LAR`** - Nftm Lar | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

- **`NFTM_MED`** - Nftm Med | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`NFTM_SMA`** - Nftm Sma | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
