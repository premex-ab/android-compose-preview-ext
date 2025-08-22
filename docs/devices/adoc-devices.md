# ADOC Devices

This document lists all Adoc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Adoc
- **Usage**: `Devices.Adoc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Adoc.ADOC_D18)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`ADOC_D18`** - Adoc D18 | **DPI**: 160
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`D30`** - D30 | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
