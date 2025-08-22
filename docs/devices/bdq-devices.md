# BDQ Devices

This document lists all Bdq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Bdq
- **Usage**: `Devices.Bdq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bdq.DESTINY)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`SMART_CAMON`** - Smart Camon | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`DESTINY`** - Destiny | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

- **`DESTINY_4G`** - Destiny 4g | **DPI**: 200
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
