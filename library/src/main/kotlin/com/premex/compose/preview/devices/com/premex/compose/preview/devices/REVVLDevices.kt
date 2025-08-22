package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REVVL device specifications for Android Compose previews.
 *
 * This extension provides REVVL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.REVVL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.REVVL: Any
  get() = object {
      /** DeviceSpec(manufacturer=REVVL, code=REVVLTAB5G, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=REVVL, code=REVVLTAB5G, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val REVVLTAB5G = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
