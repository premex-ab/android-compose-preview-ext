# ROMBICA Devices

This document lists all Rombica device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Rombica
- **Usage**: `Devices.Rombica.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Rombica.MYPHONE_JET)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`MYPHONE_JET`** - Myphone Jet | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
