# BILLOW Devices

This document lists all Billow device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Billow
- **Usage**: `Devices.Billow.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Billow.X101PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`X101PRO`** - X101pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`X103PRO`** - X103pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
