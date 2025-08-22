# VKWORLD Devices

This document lists all Vkworld device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Vkworld
- **Usage**: `Devices.Vkworld.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vkworld.VK7000)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`VKWORLD_S8`** - Vkworld S8 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`VK7000`** - Vk7000 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
