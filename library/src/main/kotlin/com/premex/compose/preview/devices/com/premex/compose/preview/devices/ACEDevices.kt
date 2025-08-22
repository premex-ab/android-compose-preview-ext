package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACE device specifications for Android Compose previews.
 *
 * This extension provides ACE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ACE, code=AS0218, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=AS0218, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AS0218 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=AS0518, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=AS0518, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AS0518 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=AS0618, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=AS0618, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val AS0618 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_1_Lite, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_1_Lite, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BUZZ_1_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_1_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_1_Plus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BUZZ_1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BUZZ_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_2_Plus, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_2_Plus, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BUZZ_2_PLUS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_3E, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_3E, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val BUZZ_3E = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_3_Lite, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_3_Lite, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val BUZZ_3_LITE = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_3_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_3_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_3_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4Lite, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4Lite, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val BUZZ_4LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_4PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_4S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4_Note, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4_Note, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val BUZZ_4_NOTE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4_Prime, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4_Prime, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val BUZZ_4_PRIME = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_4_Ultra, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_4_Ultra, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val BUZZ_4_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Lite, width=576, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Lite, width=576,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BUZZ_5_LITE = "spec:width=576,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Note, width=720, height=1650, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Note, width=720,
      height=1650, dpi=320, isGoogleDevice=false).code */
      val BUZZ_5_NOTE = "spec:width=720,height=1650,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Prime, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Prime, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_5_PRIME = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Pro_PLUS, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Pro_PLUS,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_5_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_5_Ultra, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_5_Ultra, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BUZZ_5_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Flip, width=1080, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Flip, width=1080,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val BUZZ_6_FLIP = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Prime, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Prime, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BUZZ_6_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Prime_PLUS, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Prime_PLUS,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BUZZ_6_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Pro, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Pro, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val BUZZ_6_PRO = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Pro_PLUS, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Pro_PLUS,
      width=720, height=1604, dpi=320, isGoogleDevice=false).code */
      val BUZZ_6_PRO_PLUS = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_6_Ultra, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_6_Ultra, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val BUZZ_6_ULTRA = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Lite, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Lite, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BUZZ_7_LITE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Note, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Note, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val BUZZ_7_NOTE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Prime, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Prime, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val BUZZ_7_PRIME = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Prime_PLUS, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Prime_PLUS,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BUZZ_7_PRIME_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Pro, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Pro, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val BUZZ_7_PRO = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=BUZZ_7_Ultra, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=BUZZ_7_Ultra, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val BUZZ_7_ULTRA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ACE, code=CLEVER_3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=CLEVER_3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CLEVER_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=URBAN_1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=URBAN_1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val URBAN_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=URBAN_2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=URBAN_2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val URBAN_2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=URBAN_3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=URBAN_3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val URBAN_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=URBAN_3E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=URBAN_3E, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val URBAN_3E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ACE, code=URBAN_3_PlusE, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ACE, code=URBAN_3_PlusE, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val URBAN_3_PLUSE = "spec:width=720,height=1640,unit=px,dpi=320"

  }
