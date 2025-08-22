package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXWEST device specifications for Android Compose previews.
 *
 * This extension provides MAXWEST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MAXWEST.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MAXWEST: Any
  get() = object {
      /** DeviceSpec(manufacturer=MAXWEST, code=Astro_4_PRO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXWEST, code=Astro_4_PRO,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ASTRO_4_PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAXWEST, code=Astro_5P, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXWEST, code=Astro_5P, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ASTRO_5P = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAXWEST, code=Astro_5_PRO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXWEST, code=Astro_5_PRO,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ASTRO_5_PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MAXWEST, code=Panda_7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MAXWEST, code=Panda_7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PANDA_7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
