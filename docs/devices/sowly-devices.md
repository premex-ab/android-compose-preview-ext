# SOWLY Devices

This document lists all Sowly device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Sowly
- **Usage**: `Devices.Sowly.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sowly.AG_1088_A133)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`AG_1088_A133`** - Ag 1088 A133 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`AG_1088_A133P`** - Ag 1088 A133p | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
