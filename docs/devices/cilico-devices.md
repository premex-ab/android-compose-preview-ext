# CILICO Devices

This document lists all Cilico device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Cilico
- **Usage**: `Devices.Cilico.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Cilico.C6_R)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`C6_R`** - C6 R | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`C7X_R`** - C7x R | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`C80`** - C80 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
