# JAYTECH Devices

This document lists all JayTech device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: JayTech
- **Usage**: `Devices.Jaytech.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Jaytech.TPC_G1010_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TPC_G1010_EEA`** - Tpc G1010 Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`TPC_G1011LTE`** - Tpc G1011lte | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`TPC_G109`** - Tpc G109 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
