# ALPHATEL Devices

This document lists all Alphatel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Alphatel
- **Usage**: `Devices.Alphatel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Alphatel.ALPHATEL_T1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`ALPHATEL_T1`** - Alphatel T1 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`T1_PRO`** - T1 Pro | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
