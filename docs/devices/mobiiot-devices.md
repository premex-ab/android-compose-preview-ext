# MOBIIOT Devices

This document lists all Mobiiot device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Mobiiot
- **Usage**: `Devices.Mobiiot.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mobiiot.MOBIGO2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`WM19`** - Wm19 | **DPI**: 200
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=200
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`MOBIGO2`** - Mobigo2 | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

- **`MOBIGO2L`** - Mobigo2l | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`MOBIGO2P`** - Mobigo2p | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

- **`MOBIGO2PP`** - Mobigo2pp | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

- **`MOBIGO2PQV`** - Mobigo2pqv | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

### 576x1152 (Large)

**Screen specs**: 576x1152px | **Aspect ratio**: 1:2

- **`WM58`** - Wm58 | **DPI**: 200
  ```kotlin
  spec:width=576,height=1152,unit=px,dpi=200
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MOBIPRINT4_PLUS`** - Mobiprint4 Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`MP5`** - Mp5 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
