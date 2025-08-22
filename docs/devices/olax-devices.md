# OLAX Devices

This document lists all Olax device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Olax
- **Usage**: `Devices.Olax.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Olax.MAGIC_Q1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`MAGIC_Q1`** - Magic Q1 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MAGIC_Q8`** - Magic Q8 | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`OCEAN_F8`** - Ocean F8 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`OCEAN_K10`** - Ocean K10 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`OCEAN_K8`** - Ocean K8 | **DPI**: 280
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=280
  ```

- **`OCEAN_K8_PRO`** - Ocean K8 Pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
