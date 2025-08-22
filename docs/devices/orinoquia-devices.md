# ORINOQUIA Devices

This document lists all Orinoquia device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Orinoquia
- **Usage**: `Devices.Orinoquia.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Orinoquia.HWS7701U)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`HWS7721U`** - Hws7721u | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 600x976 (Medium)

**Screen specs**: 600x976px | **Aspect ratio**: 75:122

- **`HWS7701U`** - Hws7701u | **DPI**: 160
  ```kotlin
  spec:width=600,height=976,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
