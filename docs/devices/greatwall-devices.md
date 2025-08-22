# GREATWALL Devices

This document lists all Greatwall device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Greatwall
- **Usage**: `Devices.Greatwall.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Greatwall.GWPAD_S11)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`GWPAD_S11`** - Gwpad S11 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`GWPAD_S11_1`** - Gwpad S11 1 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
