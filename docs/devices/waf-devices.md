# WAF Devices

This document lists all Waf device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Waf
- **Usage**: `Devices.Waf.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Waf.F808NM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`THMTKAW01216`** - Thmtkaw01216 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`F808NM`** - F808nm | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
