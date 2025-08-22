# MINTT Devices

This document lists all Mintt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Mintt
- **Usage**: `Devices.Mintt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mintt.COOLMINTT_BLAZE_2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`COOLMINTT_RIVAL`** - Coolmintt Rival | **DPI**: 220
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=220
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`COOLMINTT_BLAZE_2`** - Coolmintt Blaze 2 | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`MINTT_M5`** - Mintt M5 | **DPI**: 220
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=220
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`MINTT_M3`** - Mintt M3 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=300
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MINTT_T11`** - Mintt T11 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

### 800x1340 (Large)

**Screen specs**: 800x1340px | **Aspect ratio**: 40:67

- **`T3`** - T3 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1340,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
