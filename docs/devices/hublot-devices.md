# HUBLOT Devices

This document lists all Hublot device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hublot
- **Usage**: `Devices.Hublot.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hublot.HALIBUT)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 390x390 (Micro)

**Screen specs**: 390x390px | **Aspect ratio**: 1:1

- **`HALIBUT`** - Halibut | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

### 454x454 (Micro)

**Screen specs**: 454x454px | **Aspect ratio**: 1:1

- **`TURBOT`** - Turbot | **DPI**: 320
  ```kotlin
  spec:width=454,height=454,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
