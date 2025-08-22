# VAVA Devices

This document lists all Vava device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Vava
- **Usage**: `Devices.Vava.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vava.V1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 540x1080 (Medium)

**Screen specs**: 540x1080px | **Aspect ratio**: 1:2

- **`V2`** - V2 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1080,unit=px,dpi=240
  ```

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`XP3`** - Xp3 | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`V1`** - V1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
