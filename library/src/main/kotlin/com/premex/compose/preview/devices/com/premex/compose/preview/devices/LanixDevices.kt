package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lanix device specifications for Android Compose previews.
 *
 * This extension provides Lanix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lanix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lanix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Lanix, code=Alpha_1R, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Alpha_1R, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ALPHA_1R = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Alpha_1V, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Alpha_1V, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ALPHA_1V = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=ALPHA_3R, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=ALPHA_3R, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ALPHA_3R = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Alpha_3V, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Alpha_3V, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ALPHA_3V = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Alpha_5V, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Alpha_5V, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ALPHA_5V = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Lanix, code=Alpha_9V, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Alpha_9V, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ALPHA_9V = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Lanix, code=IliumPad_RX8v2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=IliumPad_RX8v2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ILIUMPAD_RX8V2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_1TT, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_1TT,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val ILIUM_ALPHA_1TT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_5T, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_5T,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ILIUM_ALPHA_5T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_9, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_Alpha_9,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val ILIUM_ALPHA_9 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_L610, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_L610, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ILIUM_L610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_LT510, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_LT510, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ILIUM_LT510 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=Ilium_M7T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=Ilium_M7T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ILIUM_M7T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=ilium_PADE10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=ilium_PADE10,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val ILIUM_PADE10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Lanix, code=ILIUM_PADE8, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=ILIUM_PADE8, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ILIUM_PADE8 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Lanix, code=L540, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=L540, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L540 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=RX10ProV7, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=RX10ProV7, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val RX10PROV7 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Lanix, code=RX10V6, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=RX10V6, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RX10V6 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Lanix, code=RX10v8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=RX10v8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RX10V8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Lanix, code=RX10v9, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=RX10v9, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val RX10V9 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Lanix, code=RX11, width=1200, height=2000, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=RX11, width=1200,
      height=2000, dpi=213, isGoogleDevice=false).code */
      val RX11 = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Lanix, code=X120C, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=X120C, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val X120C = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Lanix, code=X560, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=X560, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X560 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=X750, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=X750, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X750 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=X770, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=X770, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X770 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Lanix, code=X860, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lanix, code=X860, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X860 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
