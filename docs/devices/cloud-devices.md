# CLOUD Devices

This document lists all Cloud device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: Cloud
- **Usage**: `Devices.Cloud.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Cloud.CYCLONE_C4)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`CYCLONE_C4`** - Cyclone C4 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`STORM_C3`** - Storm C3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`STRATUS_C5`** - Stratus C5 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`STRATUS_C5_ELITE`** - Stratus C5 Elite | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`TYPHOON_C6`** - Typhoon C6 | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SUNSHINE_T1`** - Sunshine T1 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`SUNSHINE_T1_ELITE`** - Sunshine T1 Elite | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
