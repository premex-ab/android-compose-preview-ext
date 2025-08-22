# SPURT Devices

This document lists all Spurt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Spurt
- **Usage**: `Devices.Spurt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Spurt.K100)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2280 (XXL)

**Screen specs**: 1080x2280px | **Aspect ratio**: 9:19

- **`K200`** - K200 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2280,unit=px,dpi=480
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`K100`** - K100 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`SPURT_K400`** - Spurt K400 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`SPURT_K500`** - Spurt K500 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`SPURT_K600`** - Spurt K600 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`SPURT_K300`** - Spurt K300 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`SPURT_K700`** - Spurt K700 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`SPURT_K800`** - Spurt K800 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
