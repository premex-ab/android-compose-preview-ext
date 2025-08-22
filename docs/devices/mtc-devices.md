# MTC Devices

This document lists all Mtc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Mtc
- **Usage**: `Devices.Mtc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mtc.OSMARTPHONA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`OSMARTPHONA`** - Osmartphona | **DPI**: 213
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=213
  ```

- **`SMART_RACE2_4G`** - Smart Race2 4g | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`SMART_SPRINT_4G`** - Smart Sprint 4g | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SMART_SURF2_4G`** - Smart Surf2 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`OSMARTPHONA_TABLET`** - Osmartphona Tablet | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
