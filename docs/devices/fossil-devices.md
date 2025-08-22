# FOSSIL Devices

This document lists all Fossil device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Fossil
- **Usage**: `Devices.Fossil.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fossil.GILA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 390x390 (Micro)

**Screen specs**: 390x390px | **Aspect ratio**: 1:1

- **`SOLE`** - Sole | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

### 416x416 (Micro)

**Screen specs**: 416x416px | **Aspect ratio**: 1:1

- **`GILA`** - Gila | **DPI**: 320
  ```kotlin
  spec:width=416,height=416,unit=px,dpi=320
  ```

- **`HOKI`** - Hoki | **DPI**: 320
  ```kotlin
  spec:width=416,height=416,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
