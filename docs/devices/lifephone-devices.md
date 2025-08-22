# LIFEPHONE Devices

This document lists all Lifephone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Lifephone
- **Usage**: `Devices.Lifephone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lifephone.LIFEPHONE_HERO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`LIFEPHONE_VISION`** - Lifephone Vision | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`LIFEPHONE_HERO`** - Lifephone Hero | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`LIFEPHONE_IDOL`** - Lifephone Idol | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

- **`LIFEPHONE_STAR`** - Lifephone Star | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
