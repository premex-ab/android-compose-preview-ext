# TONE Devices

This document lists all Tone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Tone
- **Usage**: `Devices.Tone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tone.TONE_E19)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`TONE_E21`** - Tone E21 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`TONE_E22`** - Tone E22 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`TONE_M15`** - Tone M15 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1512 (XL)

**Screen specs**: 720x1512px | **Aspect ratio**: 10:21

- **`TONE_E19`** - Tone E19 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1512,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`TONE_E20`** - Tone E20 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
