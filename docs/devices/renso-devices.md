# RENSO Devices

This document lists all Renso device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Renso
- **Usage**: `Devices.Renso.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Renso.NEP_N1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`NEP_N1`** - Nep N1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
