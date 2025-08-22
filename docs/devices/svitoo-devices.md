# SVITOO Devices

This document lists all Svitoo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Svitoo
- **Usage**: `Devices.Svitoo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Svitoo.P08)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`TAB_P12`** - Tab P12 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`P10`** - P10 | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`P11`** - P11 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`P11_PRO_EEA`** - P11 Pro Eea | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`SVITOO_P10`** - Svitoo P10 | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

### 800x1340 (Large)

**Screen specs**: 800x1340px | **Aspect ratio**: 40:67

- **`P08`** - P08 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1340,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
