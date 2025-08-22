package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MPGIO device specifications for Android Compose previews.
 *
 * This extension provides MPGIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MPGIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MPGIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MPGIO, code=ATHENA_A10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=ATHENA_A10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ATHENA_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=IKP104, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=IKP104, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val IKP104 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MPGIO, code=Legend_A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=Legend_A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LEGEND_A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=LEGEND_NEW7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=LEGEND_NEW7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LEGEND_NEW7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=MAT10221, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MAT10221, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MAT10221 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=MAT10421, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MAT10421, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MAT10421 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MPGIO, code=MAT80211B, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MAT80211B, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MAT80211B = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MPGIO, code=MID, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MID, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=MLT156001, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MLT156001, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MLT156001 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MPGIO, code=MLT703824, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MLT703824, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MLT703824 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=MPGIO_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MPGIO_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MPGIO_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MPGIO, code=MPGIO_8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MPGIO, code=MPGIO_8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MPGIO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
