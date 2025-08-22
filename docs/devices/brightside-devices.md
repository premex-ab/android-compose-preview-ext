# BRIGHTSIDE Devices

This document lists all Brightside device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Brightside
- **Usage**: `Devices.Brightside.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Brightside.BS701)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`KS_T01`** - Ks T01 | **DPI**: 213
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=213
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`BS701`** - Bs701 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
