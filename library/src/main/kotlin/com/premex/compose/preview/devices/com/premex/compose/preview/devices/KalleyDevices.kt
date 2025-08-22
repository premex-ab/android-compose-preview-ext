package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kalley device specifications for Android Compose previews.
 *
 * This extension provides Kalley device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kalley.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kalley: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kalley, code=Black, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BLACK = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Black_1, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_1, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val BLACK_1 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Kalley, code=Black_3, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_3, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val BLACK_3 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kalley, code=Black_5, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_5, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val BLACK_5 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Kalley, code=Black_C_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_C_Plus,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BLACK_C_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Black_E, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_E, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BLACK_E = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Black_G, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_G, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BLACK_G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Black_G3, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_G3, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val BLACK_G3 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Kalley, code=Black_G_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_G_2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BLACK_G_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=BLACK_PRO, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=BLACK_PRO, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val BLACK_PRO = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Black_X, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_X, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BLACK_X = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Kalley, code=Black_Z, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Black_Z, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BLACK_Z = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Element_5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Element_5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ELEMENT_5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kalley, code=ELEMENT_MAX, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=ELEMENT_MAX,
      width=480, height=996, dpi=240, isGoogleDevice=false).code */
      val ELEMENT_MAX = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kalley, code=ELEMENT_PLAY, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=ELEMENT_PLAY,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELEMENT_PLAY = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kalley, code=ELEMENT_PRO_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=ELEMENT_PRO_2,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELEMENT_PRO_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kalley, code=Silver_Max_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Silver_Max_Lite,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SILVER_MAX_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Silver_Max_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Silver_Max_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SILVER_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=Silver_Max_Pro_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=Silver_Max_Pro_2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val SILVER_MAX_PRO_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Kalley, code=smartphone, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kalley, code=smartphone, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SMARTPHONE = "spec:width=480,height=800,unit=px,dpi=240"

  }
