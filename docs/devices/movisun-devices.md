# MOVISUN Devices

This document lists all Movisun device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Movisun
- **Usage**: `Devices.Movisun.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Movisun.ASTROA1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`TAB_S1`** - Tab S1 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`ASTROA1`** - Astroa1 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ASTRO_PAD10`** - Astro Pad10 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
