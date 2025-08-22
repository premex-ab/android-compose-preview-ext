# NETMAK Devices

This document lists all Netmak device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Netmak
- **Usage**: `Devices.Netmak.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Netmak.NM_VELOCITY)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`NM_VELOCITY`** - Nm Velocity | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
