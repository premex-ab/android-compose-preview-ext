# VATENICK Devices

This document lists all Vatenick device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Vatenick
- **Usage**: `Devices.Vatenick.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vatenick.V7)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`V7`** - V7 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`V7_EEA`** - V7 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
