# RHINO Devices

This document lists all Rhino device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Rhino
- **Usage**: `Devices.Rhino.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Rhino.NOVAX)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`STRATOS`** - Stratos | **DPI**: 260
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=260
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`NOVAX`** - Novax | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SCOUTX`** - Scoutx | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
