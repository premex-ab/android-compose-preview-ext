# ADREAMER Devices

This document lists all Adreamer device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Adreamer
- **Usage**: `Devices.Adreamer.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Adreamer.KIDSPAD10X)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KIDSPAD10X`** - Kidspad10x | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

- **`LEOPAD20`** - Leopad20 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`LEOPAD_10X`** - Leopad 10x | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
