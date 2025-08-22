# INSIGNIA Devices

This document lists all Insignia device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Insignia
- **Usage**: `Devices.Insignia.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Insignia.NS_P10A6100)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 768x1366 (Large)

**Screen specs**: 768x1366px | **Aspect ratio**: 384:683

- **`NS_P11A8100`** - Ns P11a8100 | **DPI**: 160
  ```kotlin
  spec:width=768,height=1366,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`NS_P10A6100`** - Ns P10a6100 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
