# ACD Devices

This document lists all Acd device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Acd
- **Usage**: `Devices.Acd.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Acd.ACD_TAB_10S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ACD_TAB_10S`** - Acd Tab 10s | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
