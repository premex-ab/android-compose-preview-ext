# DO Devices

This document lists all Do device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Do
- **Usage**: `Devices.Do.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Do.MATE6_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`MATE6_PRO`** - Mate6 Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
