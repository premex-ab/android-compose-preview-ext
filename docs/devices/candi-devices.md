# CANDI Devices

This document lists all Candi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Candi
- **Usage**: `Devices.Candi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Candi.BLAZE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`BLAZE`** - Blaze | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
