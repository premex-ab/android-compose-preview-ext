# HOFFMANN Devices

This document lists all Hoffmann device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Hoffmann
- **Usage**: `Devices.Hoffmann.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hoffmann.X_GO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`X_GO`** - X Go | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
