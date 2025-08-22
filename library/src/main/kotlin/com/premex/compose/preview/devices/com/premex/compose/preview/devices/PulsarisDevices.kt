package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pulsaris device specifications for Android Compose previews.
 *
 * This extension provides Pulsaris device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pulsaris.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pulsaris: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pulsaris, code=Fresh, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pulsaris, code=Fresh, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val FRESH = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pulsaris, code=Pluma, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pulsaris, code=Pluma, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val PLUMA = "spec:width=480,height=854,unit=px,dpi=220"

  }
