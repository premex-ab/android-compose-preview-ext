# LUSHMINT Devices

This document lists all LushMint device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: LushMint
- **Usage**: `Devices.Lushmint.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lushmint.LM5314G)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`LM5314G`** - Lm5314g | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`LM5514G`** - Lm5514g | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
