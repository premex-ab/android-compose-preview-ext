# HAMMER Devices

This document lists all Hammer device specifications available for Android Compose previews.

## Overview

- **Total devices**: 13
- **Manufacturer**: Hammer
- **Usage**: `Devices.Hammer.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hammer.ENERGY_2_2022)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`HAMMER_CONSTRUCTION`** - Hammer Construction | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

- **`HAMMER_EXPL_PRO`** - Hammer Expl Pro | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`HAMMER_BLADE_5G`** - Hammer Blade 5g | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`HAMMER_BLADE_4`** - Hammer Blade 4 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 1080x2408 (XXL)

**Screen specs**: 1080x2408px | **Aspect ratio**: 135:301

- **`HS2403X`** - Hs2403x | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2408,unit=px,dpi=480
  ```

- **`HS2404X`** - Hs2404x | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2408,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`ENERGY_2_2022`** - Energy 2 2022 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`EXPLORER_PLUS`** - Explorer Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`HAMMER_BLADE_3`** - Hammer Blade 3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`HS2302X`** - Hs2302x | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`HS2401X`** - Hs2401x | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`HS2402`** - Hs2402 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`HS2512`** - Hs2512 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
