# REDBEAT Devices

This document lists all Redbeat device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Redbeat
- **Usage**: `Devices.Redbeat.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Redbeat.D5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`REDBEATM2`** - Redbeatm2 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 540x1200 (Large)

**Screen specs**: 540x1200px | **Aspect ratio**: 9:20

- **`D5`** - D5 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1200,unit=px,dpi=240
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`E3`** - E3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`REDBEATA2`** - Redbeata2 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`REDBEATC1`** - Redbeatc1 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
