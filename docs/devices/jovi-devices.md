# JOVI Devices

This document lists all Jovi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Jovi
- **Usage**: `Devices.Jovi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Jovi.V2419B)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2392 (XXL)

**Screen specs**: 1080x2392px | **Aspect ratio**: 135:299

- **`V2427B`** - V2427b | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2392,unit=px,dpi=440
  ```

- **`V2440B`** - V2440b | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2392,unit=px,dpi=440
  ```

### 720x1608 (XL)

**Screen specs**: 720x1608px | **Aspect ratio**: 30:67

- **`V2419B`** - V2419b | **DPI**: 300
  ```kotlin
  spec:width=720,height=1608,unit=px,dpi=300
  ```

- **`V2434B`** - V2434b | **DPI**: 300
  ```kotlin
  spec:width=720,height=1608,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
