# HYUNDAIMAESTRO Devices

This document lists all HyundaiMaestro device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: HyundaiMaestro
- **Usage**: `Devices.Hyundaimaestro.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hyundaimaestro.HDT_1064GS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`HDT_7433H_PLUS`** - Hdt 7433h Plus | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`HDT_1064GS`** - Hdt 1064gs | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
