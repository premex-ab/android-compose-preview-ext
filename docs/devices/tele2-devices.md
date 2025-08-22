# TELE2 Devices

This document lists all Tele2 device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Tele2
- **Usage**: `Devices.Tele2.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tele2.KSTB4231)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`KSTB4231`** - Kstb4231 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`SEI700TE`** - Sei700te | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`TELE2_MAXI`** - Tele2 Maxi | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`TELE2_MINI`** - Tele2 Mini | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`TELE2_MIDI_2_0`** - Tele2 Midi 2 0 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`TELE2_MAXI_PLUS`** - Tele2 Maxi Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
