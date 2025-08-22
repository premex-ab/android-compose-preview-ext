# ORDISSIMO Devices

This document lists all Ordissimo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ordissimo
- **Usage**: `Devices.Ordissimo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ordissimo.CELIA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`LENUMERO2`** - Lenumero2 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`CELIA`** - Celia | **DPI**: 272
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=272
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`LENUMERO2MINI`** - Lenumero2mini | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
