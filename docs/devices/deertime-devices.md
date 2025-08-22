# DEERTIME Devices

This document lists all Deertime device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: Deertime
- **Usage**: `Devices.Deertime.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Deertime.E10_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`E10_EEA`** - E10 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`E15_EEA`** - E15 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`E15_US`** - E15 Us | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`E6_EEA`** - E6 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`E6_US`** - E6 Us | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`E9_EEA`** - E9 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`E9_US`** - E9 Us | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
