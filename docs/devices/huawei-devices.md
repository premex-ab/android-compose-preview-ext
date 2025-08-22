# HUAWEI Devices

This document lists all Huawei device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Huawei
- **Usage**: `Devices.Huawei.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Huawei.SAWFISH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 390x390 (Micro)

**Screen specs**: 390x390px | **Aspect ratio**: 1:1

- **`SAWFISH`** - Sawfish | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

- **`SAWSHARK`** - Sawshark | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
