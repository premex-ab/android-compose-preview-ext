package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MICROMAX device specifications for Android Compose previews.
 *
 * This extension provides MICROMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MICROMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MICROMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=MICROMAX, code=R2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MICROMAX, code=R2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MICROMAX, code=tcl_eu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MICROMAX, code=tcl_eu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCL_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
