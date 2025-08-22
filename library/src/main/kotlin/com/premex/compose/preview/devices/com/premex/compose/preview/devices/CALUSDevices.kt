package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CALUS device specifications for Android Compose previews.
 *
 * This extension provides CALUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CALUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CALUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=CALUS, code=Note_16_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CALUS, code=Note_16_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NOTE_16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

  }
