# MAXIMUS Devices

This document lists all Maximus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Maximus
- **Usage**: `Devices.Maximus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Maximus.D1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`G10_MAX`** - G10 Max | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`D7`** - D7 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`NOIR_X`** - Noir X | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`P2`** - P2 | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`D1`** - D1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`P3`** - P3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`P7`** - P7 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`P7_PLUS`** - P7 Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`R1_PRO`** - R1 Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
