# POSSAFE Devices

This document lists all Possafe device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Possafe
- **Usage**: `Devices.Possafe.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Possafe.ORDERGO5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`ORDERGO5`** - Ordergo5 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`ORDERGO_6`** - Ordergo 6 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
