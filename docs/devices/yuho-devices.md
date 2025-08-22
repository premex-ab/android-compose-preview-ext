# YUHO Devices

This document lists all Yuho device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Yuho
- **Usage**: `Devices.Yuho.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Yuho.YUHO_TAB10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`YUHO_TAB10`** - Yuho Tab10 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`YUHO_TAB8`** - Yuho Tab8 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
