package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUSE4K device specifications for Android Compose previews.
 *
 * This extension provides FUSE4K device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUSE4K.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUSE4K: Any
  get() = object {
      /** DeviceSpec(manufacturer=FUSE4K, code=SEI700L, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUSE4K, code=SEI700L, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700L = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUSE4K, code=SEI700TV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUSE4K, code=SEI700TV, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI700TV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
