package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SPC device specifications for Android Compose previews.
 *
 * This extension provides SPC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Spc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Spc: Any
  get() = object {
      /** SPC APOLO */
      val APOLO = "spec:width=480,height=960,unit=px,dpi=240"

      /** SPC Blink_10_1 */
      val BLINK_10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SPC Discovery */
      val DISCOVERY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SPC DISCOVERY_2 */
      val DISCOVERY_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** SPC DISCOVERY_2_ME */
      val DISCOVERY_2_ME = "spec:width=720,height=1600,unit=px,dpi=480"

      /** SPC DISCOVERY_3 */
      val DISCOVERY_3 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** SPC DISCOVERY_3_PRO */
      val DISCOVERY_3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SPC Discovery_Pro */
      val DISCOVERY_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** SPC Discovery_SE */
      val DISCOVERY_SE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SPC GRAVITY2-4G */
      val GRAVITY2_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY3G */
      val GRAVITY3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY4G */
      val GRAVITY4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY-2 */
      val GRAVITY_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY-2-MAX */
      val GRAVITY_2_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY_3 */
      val GRAVITY_3 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SPC GRAVITY_3G */
      val GRAVITY_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC GRAVITY_3_4G */
      val GRAVITY_3_4G = "spec:width=800,height=1332,unit=px,dpi=180"

      /** SPC GRAVITY_3_MINI */
      val GRAVITY_3_MINI = "spec:width=800,height=1280,unit=px,dpi=180"

      /** SPC GRAVITY_3_PRO */
      val GRAVITY_3_PRO = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SPC GRAVITY_3_SE */
      val GRAVITY_3_SE = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SPC GRAVITY_4 */
      val GRAVITY_4 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** SPC GRAVITY_4G */
      val GRAVITY_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC GRAVITY_4_PLUS */
      val GRAVITY_4_PLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** SPC GRAVITY_5_EEA */
      val GRAVITY_5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC GRAVITY_5_PRO */
      val GRAVITY_5_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** SPC GRAVITY_5_SE_EEA */
      val GRAVITY_5_SE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC GRAVITY_6_10 */
      val GRAVITY_6_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY_6_11 */
      val GRAVITY_6_11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC Gravity_Max */
      val GRAVITY_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC GRAVITY_OCTACORE */
      val GRAVITY_OCTACORE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY_PRO */
      val GRAVITY_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY-PRO-2 */
      val GRAVITY_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY-SE */
      val GRAVITY_SE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC GRAVITY-ULTIMATE-2 */
      val GRAVITY_ULTIMATE_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** SPC heaven-10_1 */
      val HEAVEN_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** SPC L52 */
      val L52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SPC L52_Pro */
      val L52_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SPC L53 */
      val L53 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** SPC L56 */
      val L56 = "spec:width=240,height=282,unit=px,dpi=120"

      /** SPC L60 */
      val L60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** SPC L60_Pro */
      val L60_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** SPC L60_Turbo */
      val L60_TURBO = "spec:width=480,height=854,unit=px,dpi=240"

      /** SPC L70_Lite */
      val L70_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SPC L80 */
      val L80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC L80_S */
      val L80_S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SPC Lightyear */
      val LIGHTYEAR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC LIGHTYEAR2-4G */
      val LIGHTYEAR2_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC LIGHTYEAR-2 */
      val LIGHTYEAR_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SPC martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SPC SMART_2 */
      val SMART_2 = "spec:width=442,height=960,unit=px,dpi=240"

      /** SPC SMART_3 */
      val SMART_3 = "spec:width=442,height=960,unit=px,dpi=220"

      /** SPC SMART_MAX_2 */
      val SMART_MAX_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** SPC SMART_PRO */
      val SMART_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SPC SMART_ULTIMATE */
      val SMART_ULTIMATE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** SPC SPC_GEN */
      val SPC_GEN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SPC SPC_GEN_LITE */
      val SPC_GEN_LITE = "spec:width=600,height=1280,unit=px,dpi=280"

      /** SPC SPC_GEN_MAX */
      val SPC_GEN_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** SPC SPC_GEN_PLUS */
      val SPC_GEN_PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

      /** SPC SPC_L52X */
      val SPC_L52X = "spec:width=480,height=854,unit=px,dpi=240"

      /** SPC SPC_SMART */
      val SPC_SMART = "spec:width=480,height=960,unit=px,dpi=240"

      /** SPC SPC_SMART_LITE */
      val SPC_SMART_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** SPC SPC_SMART_MAX */
      val SPC_SMART_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SPC SPC_SMART_PLUS */
      val SPC_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SPC ZEUS_4G */
      val ZEUS_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SPC ZEUS_4G_PRO */
      val ZEUS_4G_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
