# HAMLET Devices

This document lists all Hamlet device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Hamlet
- **Usage**: `Devices.Hamlet.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hamlet.XZPAD412LTE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`XZPAD412LTE`** - Xzpad412lte | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`XZPAD412W`** - Xzpad412w | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`XZPAD414W`** - Xzpad414w | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
