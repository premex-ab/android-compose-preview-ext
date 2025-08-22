# CONNEX Devices

This document lists all Connex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Connex
- **Usage**: `Devices.Connex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Connex.CTAB1044HN)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`CTAB1044HN`** - Ctab1044hn | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`CTAB_1044`** - Ctab 1044 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`SEN_1055_ARM`** - Sen 1055 Arm | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
