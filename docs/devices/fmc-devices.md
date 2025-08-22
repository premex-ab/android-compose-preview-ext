# FMC Devices

This document lists all Fmc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Fmc
- **Usage**: `Devices.Fmc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fmc.BELFORD)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2348 (XXL)

**Screen specs**: 1080x2348px | **Aspect ratio**: 270:587

- **`BELFORD`** - Belford | **DPI**: 200
  ```kotlin
  spec:width=1080,height=2348,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
