# SPECTRA Devices

This document lists all Spectra device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Spectra
- **Usage**: `Devices.Spectra.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Spectra.BCAT)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`MOBILEMAPPER6`** - Mobilemapper6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`BCAT`** - Bcat | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
