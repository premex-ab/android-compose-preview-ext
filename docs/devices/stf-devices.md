# STF Devices

This document lists all Stf device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Stf
- **Usage**: `Devices.Stf.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Stf.AURA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`BLOCK_MINI`** - Block Mini | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`BLOCK`** - Block | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`BLOCK_3`** - Block 3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`BLOCK_GO`** - Block Go | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`AURA`** - Aura | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
