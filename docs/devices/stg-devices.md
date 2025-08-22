# STG Devices

This document lists all Stg device specifications available for Android Compose previews.

## Overview

- **Total devices**: 14
- **Manufacturer**: Stg
- **Usage**: `Devices.Stg.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Stg.STG_A1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`STG_A1_PRO`** - Stg A1 Pro | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2246 (XXL)

**Screen specs**: 1080x2246px | **Aspect ratio**: 540:1123

- **`STG_X1`** - Stg X1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2246,unit=px,dpi=480
  ```

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`STG_P10`** - Stg P10 | **DPI**: 220
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=220
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`STG_C10`** - Stg C10 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`STG_B10`** - Stg B10 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`STG_A1`** - Stg A1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`STG_S1`** - Stg S1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`STG_A2_PRO`** - Stg A2 Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`STG_S20`** - Stg S20 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`STG_S30`** - Stg S30 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`STG_K10`** - Stg K10 | **DPI**: 360
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=360
  ```

- **`STG_S10`** - Stg S10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`STG_X2`** - Stg X2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`STG_X3`** - Stg X3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
