# PARTNERMOBILE Devices

This document lists all PartnerMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: PartnerMobile
- **Usage**: `Devices.Partnermobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Partnermobile.E22)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`PARTNER_EVOLUTION`** - Partner Evolution | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`E22`** - E22 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`EV1_PRO`** - Ev1 Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
