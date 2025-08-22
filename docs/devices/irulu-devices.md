# IRULU Devices

This document lists all Irulu device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Irulu
- **Usage**: `Devices.Irulu.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Irulu.IRULU_X11)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`IRULU_X11`** - Irulu X11 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
