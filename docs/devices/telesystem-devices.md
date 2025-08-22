# TELESYSTEM Devices

This document lists all Telesystem device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Telesystem
- **Usage**: `Devices.Telesystem.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Telesystem.MARTIN)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`UPT24K`** - Upt24k | **DPI**: 213
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=213
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MARTIN`** - Martin | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`ONT2HD`** - Ont2hd | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
