# KZEN Devices

This document lists all Kzen device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Kzen
- **Usage**: `Devices.Kzen.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kzen.LAMIA_L01)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`LAMIA_L01`** - Lamia L01 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
