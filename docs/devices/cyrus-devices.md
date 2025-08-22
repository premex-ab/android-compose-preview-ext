# CYRUS Devices

This document lists all Cyrus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Cyrus
- **Usage**: `Devices.Cyrus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Cyrus.CM17)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`CS45XA`** - Cs45xa | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`CS45XA_EEA`** - Cs45xa Eea | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 320x480 (Micro)

**Screen specs**: 320x480px | **Aspect ratio**: 2:3

- **`CM17`** - Cm17 | **DPI**: 132
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=132
  ```

- **`CM17XA`** - Cm17xa | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`CS22`** - Cs22 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`CS22XA`** - Cs22xa | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`CS22XA_EEA`** - Cs22xa Eea | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`CS40`** - Cs40 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
