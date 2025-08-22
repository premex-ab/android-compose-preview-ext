package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YEZZ device specifications for Android Compose previews.
 *
 * This extension provides YEZZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YEZZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YEZZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=YEZZ, code=ART1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ART1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=ART1_PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART1_PRO, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val ART1_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=ART2PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART2PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ART2PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=ART3_PRO, width=1080, height=2400, dpi=460,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART3_PRO, width=1080,
      height=2400, dpi=460, isGoogleDevice=false).code */
      val ART3_PRO = "spec:width=1080,height=2400,unit=px,dpi=460"

      /** DeviceSpec(manufacturer=YEZZ, code=ART_3S, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART_3S, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val ART_3S = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=YEZZ, code=ART_3_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=ART_3_Lite, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val ART_3_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=EPIC_3_MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=EPIC_3_MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EPIC_3_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YEZZ, code=GO1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=GO1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GO1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=GO_2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=GO_2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GO_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=GO_3, width=360, height=640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=GO_3, width=360,
      height=640, dpi=240, isGoogleDevice=false).code */
      val GO_3 = "spec:width=360,height=640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIV1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV2LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV2LTE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LIV2LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV2_LTE, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV2_LTE, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIV2_LTE = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV3_LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV3_LTE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LIV3_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV_1S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV_1S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIV_1S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV_3S, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV_3S, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LIV_3S = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=LIV_3S_LTE, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=LIV_3S_LTE, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val LIV_3S_LTE = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MAX1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX2, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX2, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val MAX2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX2_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX2_PLUS, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MAX2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MAX3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX3_ULTRA, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX3_ULTRA, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MAX3_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX_2_Ultra, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX_2_Ultra, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MAX_2_ULTRA = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=MAX_3_PLUS, width=480, height=1010, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=MAX_3_PLUS, width=480,
      height=1010, dpi=200, isGoogleDevice=false).code */
      val MAX_3_PLUS = "spec:width=480,height=1010,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YEZZ, code=4E, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=4E, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val _4E = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=5E, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=5E, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _5E = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YEZZ, code=5EQ, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YEZZ, code=5EQ, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _5EQ = "spec:width=480,height=854,unit=px,dpi=240"

  }
