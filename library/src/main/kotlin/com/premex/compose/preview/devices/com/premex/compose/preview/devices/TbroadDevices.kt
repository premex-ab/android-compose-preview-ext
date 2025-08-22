package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * tbroad device specifications for Android Compose previews.
 *
 * This extension provides tbroad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tbroad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tbroad: Any
  get() = object {
      /** DeviceSpec(manufacturer=tbroad, code=tmau400, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=tbroad, code=tmau400, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TMAU400 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
