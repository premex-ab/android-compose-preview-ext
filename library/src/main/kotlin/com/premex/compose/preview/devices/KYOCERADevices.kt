package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KYOCERA device specifications for Android Compose previews.
 *
 * This extension provides KYOCERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KYOCERA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KYOCERA: Any
  get() = object {
      /** KYOCERA A001KC */
      val A001KC = "spec:width=720,height=1480,unit=px,dpi=320"

      /** KYOCERA A201KC */
      val A201KC = "spec:width=720,height=1480,unit=px,dpi=320"

      /** KYOCERA E6810_3GB */
      val E6810_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6820 */
      val E6820 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6820TM_3GB */
      val E6820TM_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6820_3GB */
      val E6820_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6830 */
      val E6830 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6833 */
      val E6833 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6910 */
      val E6910 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E6920 */
      val E6920 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA E7110 */
      val E7110 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** KYOCERA KCP01K */
      val KCP01K = "spec:width=540,height=960,unit=px,dpi=240"

      /** KYOCERA KC-01 */
      val KC_01 = "spec:width=540,height=960,unit=px,dpi=240"

      /** KYOCERA KC-100S */
      val KC_100S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KC-S301AE */
      val KC_S301AE = "spec:width=540,height=960,unit=px,dpi=240"

      /** KYOCERA KC-S303 */
      val KC_S303 = "spec:width=1080,height=2280,unit=px,dpi=400"

      /** KYOCERA KC-S304 */
      val KC_S304 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA KC-S701 */
      val KC_S701 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KC-S702 */
      val KC_S702 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KC-T302DT */
      val KC_T302DT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KYOCERA KC-T304 */
      val KC_T304 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KY21L-RG100 */
      val KY21L_RG100 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA KY21L-ST100 */
      val KY21L_ST100 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA KY22L-SN300 */
      val KY22L_SN300 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** KYOCERA KY22L-ST200 */
      val KY22L_ST200 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA KY22M-RG100 */
      val KY22M_RG100 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** KYOCERA KY23L-RG100 */
      val KY23L_RG100 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** KYOCERA KY23M-RG100 */
      val KY23M_RG100 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** KYOCERA KY24L-SN100 */
      val KY24L_SN100 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** KYOCERA KY24L-ST100 */
      val KY24L_ST100 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** KYOCERA KY24L-ST200 */
      val KY24L_ST200 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** KYOCERA KY24L-ST300 */
      val KY24L_ST300 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** KYOCERA KY24L-TB100 */
      val KY24L_TB100 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KY24L-TB200 */
      val KY24L_TB200 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KY24L-TB300 */
      val KY24L_TB300 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KYG01 */
      val KYG01 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** KYOCERA KYT32 */
      val KYT32 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KYOCERA KYT33 */
      val KYT33 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KYT34 */
      val KYT34 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KYOCERA KYV38 */
      val KYV38 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KYV39 */
      val KYV39 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KYV40 */
      val KYV40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KYV41 */
      val KYV41 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KYV42 */
      val KYV42 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA KYV43 */
      val KYV43 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KYV44 */
      val KYV44 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KYV44_u2 */
      val KYV44_U2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KYV45 */
      val KYV45 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KYOCERA KYV46 */
      val KYV46 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA KYV47 */
      val KYV47 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** KYOCERA KYV48 */
      val KYV48 = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** KYOCERA KY-51B */
      val KY_51B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** KYOCERA KY-51D */
      val KY_51D = "spec:width=720,height=1560,unit=px,dpi=300"

      /** KYOCERA S10-KC_sprout */
      val S10_KC_SPROUT = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA S2_sprout */
      val S2_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA S4-KC_sprout */
      val S4_KC_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA S6-KC_sprout */
      val S6_KC_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** KYOCERA S8-KC_sprout */
      val S8_KC_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=400"

      /** KYOCERA S9-KC_sprout */
      val S9_KC_SPROUT = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** KYOCERA SKT01 */
      val SKT01 = "spec:width=480,height=800,unit=px,dpi=240"

      /** KYOCERA X3-KC_sprout */
      val X3_KC_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA 404KC */
      val _404KC = "spec:width=540,height=960,unit=px,dpi=240"

      /** KYOCERA 503KC */
      val _503KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA 602KC */
      val _602KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA 704KC */
      val _704KC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KYOCERA 705KC */
      val _705KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KYOCERA 901KC */
      val _901KC = "spec:width=720,height=1440,unit=px,dpi=280"

  }
