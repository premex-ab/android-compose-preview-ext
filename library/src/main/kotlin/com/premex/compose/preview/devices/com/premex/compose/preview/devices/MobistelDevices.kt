package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobistel device specifications for Android Compose previews.
 *
 * This extension provides Mobistel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobistel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobistel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mobistel, code=Cynus_F10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobistel, code=Cynus_F10,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CYNUS_F10 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
