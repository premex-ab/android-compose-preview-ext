package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GIONEE device specifications for Android Compose previews.
 *
 * This extension provides GIONEE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GIONEE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GIONEE: Any
  get() = object {
      /** GIONEE F10 */
      val F10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** GIONEE F10_Plus */
      val F10_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE F205_Pro */
      val F205_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GIONEE F8_Neo */
      val F8_NEO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GIONEE F9 */
      val F9 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** GIONEE F9_Plus */
      val F9_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** GIONEE GiONEE_BBL7337A */
      val GIONEE_BBL7337A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GiONEE_BBL7505 */
      val GIONEE_BBL7505 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GiONEE_BBL7515A */
      val GIONEE_BBL7515A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_BBL7516A */
      val GIONEE_BBL7516A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_BBL7516A01 */
      val GIONEE_BBL7516A01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_BJ17G16 */
      val GIONEE_BJ17G16 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GIONEE GIONEE_F11 */
      val GIONEE_F11 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** GIONEE GIONEE_G1602A */
      val GIONEE_G1602A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_G1605A */
      val GIONEE_G1605A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_GBL7358 */
      val GIONEE_GBL7358 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_GBL7359 */
      val GIONEE_GBL7359 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_GBL7360 */
      val GIONEE_GBL7360 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_GBL7370 */
      val GIONEE_GBL7370 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GiONEE_GBL7523 */
      val GIONEE_GBL7523 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_GBL7529 */
      val GIONEE_GBL7529 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_GBL7553 */
      val GIONEE_GBL7553 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_H601 */
      val GIONEE_H601 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE GIONEE_H603 */
      val GIONEE_H603 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE GIONEE_M100 */
      val GIONEE_M100 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** GIONEE GIONEE_M11 */
      val GIONEE_M11 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** GIONEE GIONEE_M15 */
      val GIONEE_M15 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** GIONEE GIONEE_MAX */
      val GIONEE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** GIONEE GIONEE_MAX_Pro */
      val GIONEE_MAX_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE GIONEE_P12 */
      val GIONEE_P12 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** GIONEE GIONEE_P15 */
      val GIONEE_P15 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17G01 */
      val GIONEE_SW17G01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_SW17G02 */
      val GIONEE_SW17G02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17G03 */
      val GIONEE_SW17G03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17G04 */
      val GIONEE_SW17G04 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_SW17G07 */
      val GIONEE_SW17G07 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** GIONEE GIONEE_SW17G09 */
      val GIONEE_SW17G09 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17G13 */
      val GIONEE_SW17G13 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** GIONEE GIONEE_SW17G15 */
      val GIONEE_SW17G15 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17G18 */
      val GIONEE_SW17G18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GIONEE GIONEE_SW17W04 */
      val GIONEE_SW17W04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SWG1608 */
      val GIONEE_SWG1608 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SWG1613 */
      val GIONEE_SWG1613 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_SWW1609 */
      val GIONEE_SWW1609 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_SWW1617 */
      val GIONEE_SWW1617 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_SWW1618 */
      val GIONEE_SWW1618 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SWW1627 */
      val GIONEE_SWW1627 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_SWW1631 */
      val GIONEE_SWW1631 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_WBL5708 */
      val GIONEE_WBL5708 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_WBL7361 */
      val GIONEE_WBL7361 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_WBL7365 */
      val GIONEE_WBL7365 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_WBL7372 */
      val GIONEE_WBL7372 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE GIONEE_WBL7517 */
      val GIONEE_WBL7517 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_WBL7519 */
      val GIONEE_WBL7519 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** GIONEE GIONEE_WBW5620 */
      val GIONEE_WBW5620 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** GIONEE P15_Pro */
      val P15_PRO = "spec:width=720,height=1640,unit=px,dpi=260"

      /** GIONEE P61 */
      val P61 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** GIONEE S12_Lite */
      val S12_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

  }
