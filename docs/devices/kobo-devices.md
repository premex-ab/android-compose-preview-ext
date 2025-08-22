# KOBO Devices

This document lists all Kobo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Kobo
- **Usage**: `Devices.Kobo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kobo.ZEUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1205 (Large)

**Screen specs**: 800x1205px | **Aspect ratio**: 160:241

- **`ZEUS`** - Zeus | **DPI**: 213
  ```kotlin
  spec:width=800,height=1205,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
