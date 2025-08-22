# NIO Devices

This document lists all Nio device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Nio
- **Usage**: `Devices.Nio.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nio.DAVINCI)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1440x3168 (XXL)

**Screen specs**: 1440x3168px | **Aspect ratio**: 5:11

- **`PICASSO`** - Picasso | **DPI**: 600
  ```kotlin
  spec:width=1440,height=3168,unit=px,dpi=600
  ```

### 1440x3200 (XXL)

**Screen specs**: 1440x3200px | **Aspect ratio**: 9:20

- **`DAVINCI`** - Davinci | **DPI**: 600
  ```kotlin
  spec:width=1440,height=3200,unit=px,dpi=600
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
