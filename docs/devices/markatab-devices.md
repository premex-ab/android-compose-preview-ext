# MARKATAB Devices

This document lists all Markatab device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Markatab
- **Usage**: `Devices.Markatab.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Markatab.MARKATAB_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MARKATAB_1`** - Markatab 1 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`SPEADTRUM`** - Speadtrum | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
