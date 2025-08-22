# ZOOM Devices

This document lists all Zoom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zoom
- **Usage**: `Devices.Zoom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zoom.ULTRA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`ULTRA`** - Ultra | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

- **`ULTRA_PLUS`** - Ultra Plus | **DPI**: 220
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
