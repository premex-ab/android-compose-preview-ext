# SEQUEL Devices

This document lists all Sequel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Sequel
- **Usage**: `Devices.Sequel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sequel.GLOWLIGHT)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 390x390 (Micro)

**Screen specs**: 390x390px | **Aspect ratio**: 1:1

- **`GLOWLIGHT`** - Glowlight | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
