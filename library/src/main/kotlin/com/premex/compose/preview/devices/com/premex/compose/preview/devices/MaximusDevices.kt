package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maximus device specifications for Android Compose previews.
 *
 * This extension provides Maximus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maximus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maximus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maximus, code=D1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=D1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val D1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maximus, code=D7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=D7, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val D7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maximus, code=G10_max, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=G10_max, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val G10_MAX = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=Maximus, code=Noir_X, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=Noir_X, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NOIR_X = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maximus, code=P2, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=P2, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val P2 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Maximus, code=P3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=P3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maximus, code=P7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=P7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maximus, code=P7_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=P7_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P7_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Maximus, code=R1_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maximus, code=R1_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val R1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
