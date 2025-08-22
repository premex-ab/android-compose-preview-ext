# FLASH Devices

This document lists all Flash device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Flash
- **Usage**: `Devices.Flash.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Flash.PRIME_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`PRIME_1`** - Prime 1 | **DPI**: 220
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
