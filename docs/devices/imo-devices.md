# IMO Devices

This document lists all Imo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Imo
- **Usage**: `Devices.Imo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Imo.IMO_Q2_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`IMO_Q2_PLUS`** - Imo Q2 Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

- **`IMO_Q2_PRO`** - Imo Q2 Pro | **DPI**: 213
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=213
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`IMO_Q3_PLUS`** - Imo Q3 Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`IMO_Q4_PRO`** - Imo Q4 Pro | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`IMO_Q5`** - Imo Q5 | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`S2`** - S2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
