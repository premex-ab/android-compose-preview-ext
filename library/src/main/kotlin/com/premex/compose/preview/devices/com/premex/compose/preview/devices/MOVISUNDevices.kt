package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOVISUN device specifications for Android Compose previews.
 *
 * This extension provides MOVISUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOVISUN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOVISUN: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOVISUN, code=ASTROA1, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOVISUN, code=ASTROA1, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val ASTROA1 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=MOVISUN, code=Astro_Pad10, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOVISUN, code=Astro_Pad10,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ASTRO_PAD10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MOVISUN, code=TAB-S1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOVISUN, code=TAB-S1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TAB_S1 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
