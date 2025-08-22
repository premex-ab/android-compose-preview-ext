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
      /** YEZZ ART1 */
      val ART1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** YEZZ ART1_PRO */
      val ART1_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** YEZZ ART2PRO */
      val ART2PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** YEZZ ART3_PRO */
      val ART3_PRO = "spec:width=1080,height=2400,unit=px,dpi=460"

      /** YEZZ ART_3S */
      val ART_3S = "spec:width=720,height=1600,unit=px,dpi=280"

      /** YEZZ ART_3_Lite */
      val ART_3_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** YEZZ EPIC_3_MAX */
      val EPIC_3_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** YEZZ GO1 */
      val GO1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** YEZZ GO_2 */
      val GO_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** YEZZ GO_3 */
      val GO_3 = "spec:width=360,height=640,unit=px,dpi=240"

      /** YEZZ LIV1 */
      val LIV1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** YEZZ LIV2LTE */
      val LIV2LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** YEZZ LIV2_LTE */
      val LIV2_LTE = "spec:width=540,height=960,unit=px,dpi=240"

      /** YEZZ LIV3_LTE */
      val LIV3_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** YEZZ LIV_1S */
      val LIV_1S = "spec:width=480,height=960,unit=px,dpi=240"

      /** YEZZ LIV_3S */
      val LIV_3S = "spec:width=540,height=960,unit=px,dpi=240"

      /** YEZZ LIV_3S_LTE */
      val LIV_3S_LTE = "spec:width=480,height=854,unit=px,dpi=200"

      /** YEZZ MAX1 */
      val MAX1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** YEZZ MAX2 */
      val MAX2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** YEZZ MAX2_PLUS */
      val MAX2_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** YEZZ MAX3 */
      val MAX3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** YEZZ MAX3_ULTRA */
      val MAX3_ULTRA = "spec:width=720,height=1520,unit=px,dpi=320"

      /** YEZZ MAX_2_Ultra */
      val MAX_2_ULTRA = "spec:width=600,height=1280,unit=px,dpi=240"

      /** YEZZ MAX_3_PLUS */
      val MAX_3_PLUS = "spec:width=480,height=1010,unit=px,dpi=200"

      /** YEZZ 4E */
      val _4E = "spec:width=480,height=800,unit=px,dpi=240"

      /** YEZZ 5E */
      val _5E = "spec:width=480,height=854,unit=px,dpi=240"

      /** YEZZ 5EQ */
      val _5EQ = "spec:width=480,height=854,unit=px,dpi=240"

  }
