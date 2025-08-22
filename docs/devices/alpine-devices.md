# ALPINE Devices

This document lists all Alpine device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Alpine
- **Usage**: `Devices.Alpine.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Alpine.INE_AW409S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`INE_AW409S`** - Ine Aw409s | **DPI**: 160
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=160
  ```

- **`INE_AX809`** - Ine Ax809 | **DPI**: 160
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
