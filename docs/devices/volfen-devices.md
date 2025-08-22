# VOLFEN Devices

This document lists all Volfen device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Volfen
- **Usage**: `Devices.Volfen.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Volfen.NEXO_TAB_10A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`NEXO_TAB_10A`** - Nexo Tab 10a | **DPI**: 210
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=210
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
