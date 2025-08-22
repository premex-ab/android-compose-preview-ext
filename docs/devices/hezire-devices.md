# HEZIRE Devices

This document lists all Hezire device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hezire
- **Usage**: `Devices.Hezire.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hezire.HBOOK_PRIME)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`HBOOK_PRIME`** - Hbook Prime | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

- **`HBOOK_PRO`** - Hbook Pro | **DPI**: 210
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=210
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
