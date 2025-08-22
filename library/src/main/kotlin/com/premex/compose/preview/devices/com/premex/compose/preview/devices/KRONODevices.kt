package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KRONO device specifications for Android Compose previews.
 *
 * This extension provides KRONO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KRONO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KRONO: Any
  get() = object {
      /** DeviceSpec(manufacturer=KRONO, code=COLORS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=COLORS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val COLORS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=KIDS_COLORS_PLUS, width=600, height=1024, dpi=130,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=KIDS_COLORS_PLUS,
      width=600, height=1024, dpi=130, isGoogleDevice=false).code */
      val KIDS_COLORS_PLUS = "spec:width=600,height=1024,unit=px,dpi=130"

      /** DeviceSpec(manufacturer=KRONO, code=KIDS_FIVE, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=KIDS_FIVE, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KIDS_FIVE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=MATRIX_PRO, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=MATRIX_PRO, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MATRIX_PRO = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRONO, code=NETWORK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NETWORK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NETWORK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=NET_ADVANCE, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_ADVANCE, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val NET_ADVANCE = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KRONO, code=NET_ALPHA, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_ALPHA, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NET_ALPHA = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRONO, code=NET_HIT, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_HIT, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NET_HIT = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KRONO, code=NET_K7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_K7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val NET_K7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KRONO, code=NET_K7_PLUS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_K7_PLUS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NET_K7_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=NET_LITE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_LITE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NET_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRONO, code=NET_MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NET_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=Net_Max_Go, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=Net_Max_Go, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NET_MAX_GO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KRONO, code=NET_ONE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_ONE, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val NET_ONE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRONO, code=NET_R7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_R7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val NET_R7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KRONO, code=NET_TITAN, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_TITAN, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NET_TITAN = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRONO, code=NET_VOLT, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_VOLT, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val NET_VOLT = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KRONO, code=NET_X2, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_X2, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val NET_X2 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=KRONO, code=NET_Y, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=NET_Y, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NET_Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KRONO, code=ULTRA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KRONO, code=ULTRA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ULTRA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
