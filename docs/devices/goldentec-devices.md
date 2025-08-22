# GOLDENTEC Devices

This document lists all Goldentec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Goldentec
- **Usage**: `Devices.Goldentec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Goldentec.GT_METAL_TAB10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`GT_TAB7`** - Gt Tab7 | **DPI**: 192
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=192
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`GT_METAL_TAB10`** - Gt Metal Tab10 | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

- **`GT_TAB10`** - Gt Tab10 | **DPI**: 178
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=178
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
