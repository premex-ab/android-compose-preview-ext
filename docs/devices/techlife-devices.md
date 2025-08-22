# TECHLIFE Devices

This document lists all Techlife device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Techlife
- **Usage**: `Devices.Techlife.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Techlife.TLPAD001)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`TLPAD001`** - Tlpad001 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`TLPADP04`** - Tlpadp04 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TLPAD002`** - Tlpad002 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
