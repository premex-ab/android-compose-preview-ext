# MOBULAA Devices

This document lists all Mobulaa device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Mobulaa
- **Usage**: `Devices.Mobulaa.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mobulaa.NOTE2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`NOTE2`** - Note2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`NOTE4`** - Note4 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=300
  ```

- **`S11`** - S11 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TAB_1`** - Tab 1 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
