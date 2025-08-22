# DEPLAY Devices

This document lists all Deplay device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: Deplay
- **Usage**: `Devices.Deplay.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Deplay.BS101_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`BS703_EEA`** - Bs703 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`LITE4_EEA`** - Lite4 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BS101_EEA`** - Bs101 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`BS801_EEA`** - Bs801 Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`E101GCM`** - E101gcm | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`E108GCM`** - E108gcm | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`PRO4`** - Pro4 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
