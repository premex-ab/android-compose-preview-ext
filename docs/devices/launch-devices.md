# LAUNCH Devices

This document lists all Launch device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Launch
- **Usage**: `Devices.Launch.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Launch.DIAGNOSTIC_TABLET)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`X_431PADVII`** - X 431padvii | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`DIAGNOSTIC_TOOL`** - Diagnostic Tool | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`DIAGNOSTIC_TABLET`** - Diagnostic Tablet | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
