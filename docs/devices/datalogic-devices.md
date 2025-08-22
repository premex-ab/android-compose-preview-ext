# DATALOGIC Devices

This document lists all Datalogic device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Datalogic
- **Usage**: `Devices.Datalogic.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Datalogic.DL35)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`NEBULA_PDA`** - Nebula Pda | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

- **`Q10`** - Q10 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=440
  ```

- **`Q10A`** - Q10a | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=440
  ```

- **`TOMCAT_PDA`** - Tomcat Pda | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`SX5`** - Sx5 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`M1_HANDHELD`** - M1 Handheld | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DL35`** - Dl35 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`M11`** - M11 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
