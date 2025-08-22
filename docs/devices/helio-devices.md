# HELIO Devices

This document lists all Helio device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Helio
- **Usage**: `Devices.Helio.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Helio.HELIO_40)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`HELIO_50`** - Helio 50 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 720x1604 (XL)

**Screen specs**: 720x1604px | **Aspect ratio**: 180:401

- **`HELIO_40`** - Helio 40 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1604,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
