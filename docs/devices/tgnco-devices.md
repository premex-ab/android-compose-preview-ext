# TGNCO Devices

This document lists all Tgnco device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Tgnco
- **Usage**: `Devices.Tgnco.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tgnco.JGR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`PHX`** - Phx | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1440x2560 (XXL)

**Screen specs**: 1440x2560px | **Aspect ratio**: 9:16

- **`JGR`** - Jgr | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
