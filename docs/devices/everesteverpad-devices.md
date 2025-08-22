# EVERESTEVERPAD Devices

This document lists all EverestEverpad device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: EverestEverpad
- **Usage**: `Devices.Everesteverpad.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Everesteverpad.DC_M700)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`DC_M700`** - Dc M700 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`MID7015A_MK`** - Mid7015a Mk | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`MID7015_MK`** - Mid7015 Mk | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MID1032_MK`** - Mid1032 Mk | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
