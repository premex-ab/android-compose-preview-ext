# NISSAN Devices

This document lists all Nissan device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Nissan
- **Usage**: `Devices.Nissan.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nissan.AIVI2_B)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1920 (XL)

**Screen specs**: 720x1920px | **Aspect ratio**: 3:8

- **`AIVI2_B`** - Aivi2 B | **DPI**: 160
  ```kotlin
  spec:width=720,height=1920,unit=px,dpi=160
  ```

- **`AIVI2_N_FULL`** - Aivi2 N Full | **DPI**: 160
  ```kotlin
  spec:width=720,height=1920,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
