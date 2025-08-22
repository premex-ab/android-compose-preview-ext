# BQMOBILE Devices

This document lists all Bqmobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Bqmobile
- **Usage**: `Devices.Bqmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bqmobile.BQ6761)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`BQ6861L`** - Bq6861l | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`BQ6761`** - Bq6761 | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
