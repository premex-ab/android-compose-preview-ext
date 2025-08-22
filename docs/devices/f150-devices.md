# F150 Devices

This document lists all F150 device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: F150
- **Usage**: `Devices.F150.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.F150.AIR1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`AIR1`** - Air1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

- **`AIR1_PRO`** - Air1 Pro | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

- **`B1`** - B1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

- **`B1_PRO`** - B1 Pro | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`R2022`** - R2022 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`H2022`** - H2022 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`B2021`** - B2021 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`BISON2021`** - Bison2021 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
