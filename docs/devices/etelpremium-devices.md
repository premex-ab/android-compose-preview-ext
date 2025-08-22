# ETELPREMIUM Devices

This document lists all Etelpremium device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Etelpremium
- **Usage**: `Devices.Etelpremium.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Etelpremium.E26)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`E65`** - E65 | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`E26`** - E26 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`NOTE_25_ULTRA`** - Note 25 Ultra | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
