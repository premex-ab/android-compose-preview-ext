# ZMBIZI Devices

This document lists all Zmbizi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zmbizi
- **Usage**: `Devices.Zmbizi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zmbizi.ZMBIZI_Z1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2280 (XXL)

**Screen specs**: 1080x2280px | **Aspect ratio**: 9:19

- **`ZMBIZI_Z1`** - Zmbizi Z1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2280,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`ZMBIZI_Z2`** - Zmbizi Z2 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
