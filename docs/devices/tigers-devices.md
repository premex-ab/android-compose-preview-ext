# TIGERS Devices

This document lists all Tigers device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Tigers
- **Usage**: `Devices.Tigers.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tigers.TIS001_S3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`TIS001_S3`** - Tis001 S3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`TIS001_S4`** - Tis001 S4 | **DPI**: 220
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
