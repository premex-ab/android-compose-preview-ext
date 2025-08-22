# WISETECH Devices

This document lists all Wisetech device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Wisetech
- **Usage**: `Devices.Wisetech.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wisetech.WISETECH_NOTE_10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`WISETECH_NOTE_10`** - Wisetech Note 10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`WISETECH_NOTE_12`** - Wisetech Note 12 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
