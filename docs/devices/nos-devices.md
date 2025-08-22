# NOS Devices

This document lists all Nos device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Nos
- **Usage**: `Devices.Nos.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nos.DV9161_KPN)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DV9161_KPN`** - Dv9161 Kpn | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
