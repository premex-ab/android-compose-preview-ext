# HATCH Devices

This document lists all Hatch device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hatch
- **Usage**: `Devices.Hatch.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hatch.HATCH_102S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`HATCH_102S`** - Hatch 102s | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`HATCH_103S`** - Hatch 103s | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
