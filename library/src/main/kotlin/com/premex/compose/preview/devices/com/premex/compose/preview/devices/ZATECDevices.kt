package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZATEC device specifications for Android Compose previews.
 *
 * This extension provides ZATEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZATEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZATEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZATEC, code=JOY, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZATEC, code=JOY, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val JOY = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZATEC, code=JOY_PLUS, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZATEC, code=JOY_PLUS, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val JOY_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZATEC, code=WIND, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZATEC, code=WIND, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val WIND = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZATEC, code=ZATEC_Zpower_2018, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZATEC, code=ZATEC_Zpower_2018,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ZATEC_ZPOWER_2018 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZATEC, code=ZPAD_1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZATEC, code=ZPAD_1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ZPAD_1 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
