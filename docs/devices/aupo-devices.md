# AUPO Devices

This document lists all Aupo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Aupo
- **Usage**: `Devices.Aupo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Aupo.AUPO_ZEUS_10_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`AUPO_ZEUS_10_PRO`** - Aupo Zeus 10 Pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`AUPO_ZEUS_10_PRO_ROW`** - Aupo Zeus 10 Pro Row | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
