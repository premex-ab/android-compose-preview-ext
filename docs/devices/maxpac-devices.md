# MAXPAC Devices

This document lists all Maxpac device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Maxpac
- **Usage**: `Devices.Maxpac.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Maxpac.PARROT_3G)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`PARROT_3G`** - Parrot 3g | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
