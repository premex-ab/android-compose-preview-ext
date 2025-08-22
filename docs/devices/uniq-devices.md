# UNIQ Devices

This document lists all Uniq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Uniq
- **Usage**: `Devices.Uniq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Uniq.D10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`D7`** - D7 | **DPI**: 180
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=180
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`D10`** - D10 | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
