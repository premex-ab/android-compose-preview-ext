# VESTEL Devices

This document lists all Vestel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Vestel
- **Usage**: `Devices.Vestel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vestel.VTABZ1A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`V_TAB_7020A`** - V Tab 7020a | **DPI**: 240
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=240
  ```

### 768x1024 (Medium)

**Screen specs**: 768x1024px | **Aspect ratio**: 3:4

- **`V_TAB_7810`** - V Tab 7810 | **DPI**: 160
  ```kotlin
  spec:width=768,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`VTABZ1A`** - Vtabz1a | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`V_TAB_1050`** - V Tab 1050 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
