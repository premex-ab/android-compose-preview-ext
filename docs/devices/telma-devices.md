# TELMA Devices

This document lists all Telma device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Telma
- **Usage**: `Devices.Telma.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Telma.EGO_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`TELMA_IFEEL_MAX`** - Telma Ifeel Max | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x996 (Medium)

**Screen specs**: 480x996px | **Aspect ratio**: 40:83

- **`EGO_PLUS`** - Ego Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
