# WILEYFOX Devices

This document lists all Wileyfox device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Wileyfox
- **Usage**: `Devices.Wileyfox.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wileyfox.CRACKLING)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`MARMITE`** - Marmite | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`CRACKLING`** - Crackling | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`PORRIDGE`** - Porridge | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`PORRIDGEK3`** - Porridgek3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
