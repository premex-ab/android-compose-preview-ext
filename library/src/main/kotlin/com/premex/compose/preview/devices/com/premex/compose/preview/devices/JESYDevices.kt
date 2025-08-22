package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JESY device specifications for Android Compose previews.
 *
 * This extension provides JESY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JESY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JESY: Any
  get() = object {
      /** DeviceSpec(manufacturer=JESY, code=JESY_J20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JESY, code=JESY_J20, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val JESY_J20 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
