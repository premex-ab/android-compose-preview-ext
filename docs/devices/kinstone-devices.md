# KINSTONE Devices

This document lists all Kinstone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Kinstone
- **Usage**: `Devices.Kinstone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kinstone.KST102SF)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`KST103SD_J`** - Kst103sd J | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`KST103SD_L`** - Kst103sd L | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KST102SF`** - Kst102sf | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`KST102SF_EA`** - Kst102sf Ea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
