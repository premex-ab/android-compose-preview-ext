# MOOLAHMOBILE Devices

This document lists all MoolahMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: MoolahMobile
- **Usage**: `Devices.Moolahmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Moolahmobile.T10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`T10`** - T10 | **DPI**: 186
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=186
  ```

- **`T100`** - T100 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`T10_PRO`** - T10 Pro | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
