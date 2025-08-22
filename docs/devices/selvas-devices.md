# SELVAS Devices

This document lists all Selvas device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Selvas
- **Usage**: `Devices.Selvas.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Selvas.BRAILLESENSE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`BRAILLESENSE`** - Braillesense | **DPI**: 280
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=280
  ```

- **`BRAILLESENSEMINI`** - Braillesensemini | **DPI**: 280
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
