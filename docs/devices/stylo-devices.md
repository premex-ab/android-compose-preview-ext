# STYLO Devices

This document lists all Stylo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Stylo
- **Usage**: `Devices.Stylo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Stylo.QUANTUM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`S501`** - S501 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`QUANTUM`** - Quantum | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`STYLO_521`** - Stylo 521 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=300
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SIRIUS_PLUS_TAB_10`** - Sirius Plus Tab 10 | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
