# LAIQ Devices

This document lists all Laiq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Laiq
- **Usage**: `Devices.Laiq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Laiq.LAIQ_GLAM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`LAIQ_GLAM`** - Laiq Glam | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`STARTRAIL`** - Startrail | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
