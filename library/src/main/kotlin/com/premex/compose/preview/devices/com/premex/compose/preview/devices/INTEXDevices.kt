package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INTEX device specifications for Android Compose previews.
 *
 * This extension provides INTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_A4_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_A4_PLUS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val INTEX_AQUA_A4_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_2,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val INTEX_AQUA_LIONS_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INTEX_AQUA_LIONS_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_LIONS_4G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val INTEX_AQUA_LIONS_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_S3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_S3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INTEX_AQUA_S3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_SELFIE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_SELFIE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INTEX_AQUA_SELFIE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_STYLE_3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_AQUA_STYLE_3,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val INTEX_AQUA_STYLE_3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INTEX, code=INTEX_ELYT_DUAL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=INTEX_ELYT_DUAL,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val INTEX_ELYT_DUAL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=INTEX, code=R1, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INTEX, code=R1, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

  }
