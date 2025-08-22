# UNBLUABLE Devices

This document lists all Unbluable device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Unbluable
- **Usage**: `Devices.Unbluable.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Unbluable.PAPERTABLET)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 768x1024 (Medium)

**Screen specs**: 768x1024px | **Aspect ratio**: 3:4

- **`PAPERTABLET`** - Papertablet | **DPI**: 160
  ```kotlin
  spec:width=768,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
