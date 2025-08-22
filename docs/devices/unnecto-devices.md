# UNNECTO Devices

This document lists all Unnecto device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Unnecto
- **Usage**: `Devices.Unnecto.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Unnecto.BOLT1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`BOLT1`** - Bolt1 | **DPI**: 180
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=180
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`BOLT20`** - Bolt20 | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`BOLT10`** - Bolt10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
