# ARTRAN Devices

This document lists all Artran device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Artran
- **Usage**: `Devices.Artran.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Artran.ARTRAN_EI101F)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`ARTRAN_EI101F`** - Artran Ei101f | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`AZ101F`** - Az101f | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`IB101F_PRO`** - Ib101f Pro | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 800x1340 (Large)

**Screen specs**: 800x1340px | **Aspect ratio**: 40:67

- **`IB868H`** - Ib868h | **DPI**: 180
  ```kotlin
  spec:width=800,height=1340,unit=px,dpi=180
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
