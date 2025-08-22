# VOCAL Devices

This document lists all Vocal device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Vocal
- **Usage**: `Devices.Vocal.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vocal.V0)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`V0CORE`** - V0core | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`V1`** - V1 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`V0`** - V0 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`V01`** - V01 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`V11`** - V11 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
