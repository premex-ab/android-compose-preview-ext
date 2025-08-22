# TOPSAND Devices

This document lists all Topsand device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Topsand
- **Usage**: `Devices.Topsand.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Topsand.G12_A14)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`G12_A14`** - G12 A14 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`M8_U`** - M8 U | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`N8_KIDS`** - N8 Kids | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

### 800x1340 (Large)

**Screen specs**: 800x1340px | **Aspect ratio**: 40:67

- **`N8_PLUS`** - N8 Plus | **DPI**: 213
  ```kotlin
  spec:width=800,height=1340,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
