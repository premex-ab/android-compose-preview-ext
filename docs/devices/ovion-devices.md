# OVION Devices

This document lists all Ovion device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ovion
- **Usage**: `Devices.Ovion.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ovion.V11_LITE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2412 (XXL)

**Screen specs**: 1080x2412px | **Aspect ratio**: 30:67

- **`V20_PRO`** - V20 Pro | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2412,unit=px,dpi=400
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`V11_LITE`** - V11 Lite | **DPI**: 480
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
