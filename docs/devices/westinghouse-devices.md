# WESTINGHOUSE Devices

This document lists all Westinghouse device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Westinghouse
- **Usage**: `Devices.Westinghouse.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Westinghouse.UENO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`WH10S9863232`** - Wh10s9863232 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`W10TWF19`** - W10twf19 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`UENO`** - Ueno | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
