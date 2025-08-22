# HAOVM Devices

This document lists all Haovm device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Haovm
- **Usage**: `Devices.Haovm.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Haovm.HP10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`HP20`** - Hp20 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`PS30`** - Ps30 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`HP10`** - Hp10 | **DPI**: 186
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=186
  ```

- **`HP10_EEA`** - Hp10 Eea | **DPI**: 186
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=186
  ```

- **`P10_2024`** - P10 2024 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`P10_PRO`** - P10 Pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`P20`** - P20 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`P9`** - P9 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`P9_EEA`** - P9 Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`T2000`** - T2000 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
