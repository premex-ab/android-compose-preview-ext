# PSMOBILE Devices

This document lists all PsMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: PsMobile
- **Usage**: `Devices.Psmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Psmobile.NEO_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`NEO_PRO`** - Neo Pro | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
