# NOTHING Devices

This document lists all Nothing device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Nothing
- **Usage**: `Devices.Nothing.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nothing.ASTEROIDS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2392 (XXL)

**Screen specs**: 1080x2392px | **Aspect ratio**: 135:299

- **`ASTEROIDS`** - Asteroids | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2392,unit=px,dpi=420
  ```

- **`GALAGA`** - Galaga | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2392,unit=px,dpi=420
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`SPACEWAR`** - Spacewar | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=420
  ```

- **`TETRIS`** - Tetris | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=420
  ```

### 1080x2412 (XXL)

**Screen specs**: 1080x2412px | **Aspect ratio**: 30:67

- **`PONG`** - Pong | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2412,unit=px,dpi=420
  ```

### 1084x2412 (XXL)

**Screen specs**: 1084x2412px | **Aspect ratio**: 271:603

- **`PACMAN`** - Pacman | **DPI**: 420
  ```kotlin
  spec:width=1084,height=2412,unit=px,dpi=420
  ```

- **`PACMANPRO`** - Pacmanpro | **DPI**: 420
  ```kotlin
  spec:width=1084,height=2412,unit=px,dpi=420
  ```

### 1260x2800 (XXL)

**Screen specs**: 1260x2800px | **Aspect ratio**: 9:20

- **`METROID`** - Metroid | **DPI**: 480
  ```kotlin
  spec:width=1260,height=2800,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
