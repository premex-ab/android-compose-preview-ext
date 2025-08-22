# FIGO Devices

This document lists all Figo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Figo
- **Usage**: `Devices.Figo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Figo.ORBIT_LL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`ORBIT_LL`** - Orbit Ll | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`TELECELL`** - Telecell | **DPI**: 180
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=180
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
