# WHOOP Devices

This document lists all Whoop device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Whoop
- **Usage**: `Devices.Whoop.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Whoop.TAB_8US2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TAB_8US2`** - Tab 8us2 | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
