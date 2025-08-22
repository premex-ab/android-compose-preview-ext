# GOME Devices

This document lists all Gome device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Gome
- **Usage**: `Devices.Gome.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gome.GOME_C7)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`GOME_C7`** - Gome C7 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`GOME_C7_NOTE`** - Gome C7 Note | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`GOME_C7_NOTE_MINI`** - Gome C7 Note Mini | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
