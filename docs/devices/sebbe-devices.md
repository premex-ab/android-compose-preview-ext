# SEBBE Devices

This document lists all Sebbe device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Sebbe
- **Usage**: `Devices.Sebbe.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sebbe.S21_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`S23_T_EEA`** - S23 T Eea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

- **`S23_T_US`** - S23 T Us | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`S21_EEA`** - S21 Eea | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`S22_EEA`** - S22 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`S23_EEA_A`** - S23 Eea A | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`S23_US_B`** - S23 Us B | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

### 800x1332 (Large)

**Screen specs**: 800x1332px | **Aspect ratio**: 200:333

- **`S23_EEA`** - S23 Eea | **DPI**: 160
  ```kotlin
  spec:width=800,height=1332,unit=px,dpi=160
  ```

- **`S23_US`** - S23 Us | **DPI**: 160
  ```kotlin
  spec:width=800,height=1332,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
