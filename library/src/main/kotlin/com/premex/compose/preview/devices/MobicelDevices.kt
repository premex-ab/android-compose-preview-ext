package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobicel device specifications for Android Compose previews.
 *
 * This extension provides Mobicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobicel: Any
  get() = object {
      /** Mobicel ASTRO */
      val ASTRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel BEAM */
      val BEAM = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel BERRY */
      val BERRY = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel BERRY1 */
      val BERRY1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel BERRY_2 */
      val BERRY_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel BERRY_PLUS */
      val BERRY_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel BERRY_PRO */
      val BERRY_PRO = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobicel BLINK */
      val BLINK = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Candy */
      val CANDY = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel Chrome_LTE */
      val CHROME_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel CLIK */
      val CLIK = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Clik_plus */
      val CLIK_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Cosmo_LTE */
      val COSMO_LTE = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel DANDY */
      val DANDY = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel DANDY_ZAM */
      val DANDY_ZAM = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel EGO */
      val EGO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel EPIC_1 */
      val EPIC_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel EPIC_2 */
      val EPIC_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel EPIC_MAX */
      val EPIC_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Mobicel EPIC_PRO_1 */
      val EPIC_PRO_1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel EPIC_PRO_2 */
      val EPIC_PRO_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel F40 */
      val F40 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobicel F41 */
      val F41 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel F50 */
      val F50 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel F51 */
      val F51 = "spec:width=480,height=854,unit=px,dpi=180"

      /** Mobicel FAME */
      val FAME = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel FAME_DS */
      val FAME_DS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel FENDY_DS */
      val FENDY_DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Fendy_plus */
      val FENDY_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel FEVER_PLUS_H */
      val FEVER_PLUS_H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mobicel Fever_Plus_J */
      val FEVER_PLUS_J = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mobicel FORCE */
      val FORCE = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel FRIO */
      val FRIO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel GEO */
      val GEO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel GLO */
      val GLO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel HERO */
      val HERO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel HERO_DS */
      val HERO_DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel HYPE */
      val HYPE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mobicel IX */
      val IX = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Mobicel IX-1 */
      val IX_1 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Mobicel IX_PLUS */
      val IX_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Mobicel IX_PRO */
      val IX_PRO = "spec:width=720,height=1600,unit=px,dpi=260"

      /** Mobicel Legend */
      val LEGEND = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Mobicel LEGEND_MAX */
      val LEGEND_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Mobicel Legend_Max_2 */
      val LEGEND_MAX_2 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Mobicel LEGEND_PRO_1 */
      val LEGEND_PRO_1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel Legend_Pro_LTE */
      val LEGEND_PRO_LTE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel Mercury */
      val MERCURY = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Mobicel Mobicel_Icon */
      val MOBICEL_ICON = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Mobicel_R1 */
      val MOBICEL_R1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel Mobicel_R6 */
      val MOBICEL_R6 = "spec:width=540,height=960,unit=px,dpi=213"

      /** Mobicel MX2_PLUS */
      val MX2_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel MX3_PLUS */
      val MX3_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel NEO_1 */
      val NEO_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Neo_LTE */
      val NEO_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Neo_Plus */
      val NEO_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel OREO */
      val OREO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel P11 */
      val P11 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel P11_Plus */
      val P11_PLUS = "spec:width=576,height=1152,unit=px,dpi=220"

      /** Mobicel P12 */
      val P12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel P5 */
      val P5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** Mobicel PULSE_1 */
      val PULSE_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel PURE */
      val PURE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel PURE_MINI */
      val PURE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel PURE_PLUS */
      val PURE_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel PX12 */
      val PX12 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Mobicel Q10 */
      val Q10 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** Mobicel R1PLUS_1 */
      val R1PLUS_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R1_Plus */
      val R1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R4 */
      val R4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel R4_LTE */
      val R4_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R6_PLUS */
      val R6_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mobicel R7 */
      val R7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R7_1 */
      val R7_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R7_2 */
      val R7_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel R8 */
      val R8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mobicel R9_LITE */
      val R9_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mobicel R9_Pro */
      val R9_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel REBEL */
      val REBEL = "spec:width=320,height=480,unit=px,dpi=160"

      /** Mobicel RIO_BN */
      val RIO_BN = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel RIO_RW */
      val RIO_RW = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel RIO_SS */
      val RIO_SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel RIO_ZAM */
      val RIO_ZAM = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel RUBY */
      val RUBY = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel RUSH */
      val RUSH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel RX */
      val RX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel RX17 */
      val RX17 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel RX_Plus */
      val RX_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Mobicel RX_PRO */
      val RX_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Mobicel Smart_Tab_10 */
      val SMART_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=280"

      /** Mobicel Smart_Tab_8 */
      val SMART_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Mobicel SWITCH */
      val SWITCH = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel SWITCH1 */
      val SWITCH1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel Switch_GO */
      val SWITCH_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel switch_plus */
      val SWITCH_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel TANGO_LITE */
      val TANGO_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel TITAN */
      val TITAN = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel Titan_1 */
      val TITAN_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel TRENDY_2 */
      val TRENDY_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel TRENDY_LITE */
      val TRENDY_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel TRENDY_PLUS */
      val TRENDY_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel U2 */
      val U2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Mobicel ULTRA */
      val ULTRA = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel V1 */
      val V1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel V2_LTE */
      val V2_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel V4 */
      val V4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel VEGA */
      val VEGA = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel VENUS_G */
      val VENUS_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Mobicel VIBE */
      val VIBE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicel VX18 */
      val VX18 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** Mobicel VX19 */
      val VX19 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel VX20 */
      val VX20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel VX20_PRO */
      val VX20_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel VX21 */
      val VX21 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel X1 */
      val X1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mobicel X4 */
      val X4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Mobicel X6 */
      val X6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel X7 */
      val X7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel X9 */
      val X9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Mobicel Z4 */
      val Z4 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Mobicel ZOOM */
      val ZOOM = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mobicel ZOOM_1 */
      val ZOOM_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mobicel ZOOM_H */
      val ZOOM_H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Mobicel 4U */
      val _4U = "spec:width=480,height=854,unit=px,dpi=240"

  }
