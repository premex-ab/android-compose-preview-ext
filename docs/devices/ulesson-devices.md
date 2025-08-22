# ULESSON Devices

This document lists all Ulesson device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ulesson
- **Usage**: `Devices.Ulesson.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ulesson.ULESSON_EDUCATION_TAB)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ULESSON_EDUCATION_TAB`** - Ulesson Education Tab | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`ULESSON_TAB_V2`** - Ulesson Tab V2 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
