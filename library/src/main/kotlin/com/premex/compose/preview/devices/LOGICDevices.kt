package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LOGIC device specifications for Android Compose previews.
 *
 * This extension provides LOGIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LOGIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LOGIC: Any
  get() = object {
      /** LOGIC L4T */
      val L4T = "spec:width=480,height=800,unit=px,dpi=200"

      /** LOGIC L55B */
      val L55B = "spec:width=444,height=960,unit=px,dpi=213"

      /** LOGIC L63A */
      val L63A = "spec:width=720,height=1520,unit=px,dpi=300"

      /** LOGIC L66 */
      val L66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC L66_LITE */
      val L66_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC L66_PRO */
      val L66_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC L68_Ultra */
      val L68_ULTRA = "spec:width=720,height=1600,unit=px,dpi=260"

      /** LOGIC LOGIC_G1L */
      val LOGIC_G1L = "spec:width=720,height=1612,unit=px,dpi=280"

      /** LOGIC LOGIC_L4T */
      val LOGIC_L4T = "spec:width=480,height=800,unit=px,dpi=200"

      /** LOGIC LOGIC_L50 */
      val LOGIC_L50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LOGIC LOGIC_L50T */
      val LOGIC_L50T = "spec:width=480,height=960,unit=px,dpi=240"

      /** LOGIC LOGIC_L55S */
      val LOGIC_L55S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LOGIC LOGIC_L55V_PLUS */
      val LOGIC_L55V_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** LOGIC LOGIC_L5D */
      val LOGIC_L5D = "spec:width=480,height=854,unit=px,dpi=240"

      /** LOGIC LOGIC_L60 */
      val LOGIC_L60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LOGIC LOGIC_L61 */
      val LOGIC_L61 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** LOGIC LOGIC_L63 */
      val LOGIC_L63 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** LOGIC LOGIC_L65 */
      val LOGIC_L65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC LOGIC_L65T */
      val LOGIC_L65T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC LOGIC_L65_LITE */
      val LOGIC_L65_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC LOGIC_L66M */
      val LOGIC_L66M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LOGIC LOGIC_L68 */
      val LOGIC_L68 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** LOGIC LOGIC_MV01 */
      val LOGIC_MV01 = "spec:width=480,height=854,unit=px,dpi=200"

      /** LOGIC LOGIC_MV02 */
      val LOGIC_MV02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LOGIC LOGIC_T10L_PLUS */
      val LOGIC_T10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** LOGIC LOGIC_T10M */
      val LOGIC_T10M = "spec:width=800,height=1280,unit=px,dpi=200"

      /** LOGIC LOGIC_X40 */
      val LOGIC_X40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LOGIC LOGIC_X50 */
      val LOGIC_X50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LOGIC LOGIC_X50X */
      val LOGIC_X50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** LOGIC LOGIC_X57A */
      val LOGIC_X57A = "spec:width=720,height=1600,unit=px,dpi=300"

      /** LOGIC T10B */
      val T10B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LOGIC T10L */
      val T10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LOGIC T3G */
      val T3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** LOGIC T3GPlus */
      val T3GPLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGIC T4G */
      val T4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LOGIC X4G */
      val X4G = "spec:width=480,height=800,unit=px,dpi=240"

      /** LOGIC X50A */
      val X50A = "spec:width=480,height=854,unit=px,dpi=240"

  }
