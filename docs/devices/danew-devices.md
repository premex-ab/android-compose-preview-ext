# DANEW Devices

This document lists all Danew device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Danew
- **Usage**: `Devices.Danew.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Danew.DANEW_KONNECT_556)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`DANEW_KONNECT_556`** - Danew Konnect 556 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`KONNECT_557`** - Konnect 557 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
