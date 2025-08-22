# EWIS Devices

This document lists all Ewis device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ewis
- **Usage**: `Devices.Ewis.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ewis.OCTA_T700M)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`OCTA_T700M`** - Octa T700m | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`OCTA_T700M_T2`** - Octa T700m T2 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
