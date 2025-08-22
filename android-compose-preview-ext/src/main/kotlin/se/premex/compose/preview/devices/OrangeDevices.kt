package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Orange device specifications for Android Compose previews.
 *
 * This extension provides Orange device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orange.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orange: Any
  get() = object {
      /** Orange Alto45 */
      val ALTO45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange BUZZ6T4G */
      val BUZZ6T4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange Dive_70 */
      val DIVE_70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange Dive_73 */
      val DIVE_73 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Orange DSB0010 */
      val DSB0010 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange DSB0110 */
      val DSB0110 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange DV8555-KPO */
      val DV8555_KPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Orange hwG535-L11 */
      val HWG535_L11 = "spec:width=540,height=960,unit=px,dpi=240"

      /** Orange hwG740-L00 */
      val HWG740_L00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange hwt1821l */
      val HWT1821L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Orange hwt1a21l */
      val HWT1A21L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Orange KSTB7259 */
      val KSTB7259 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Orange Luno */
      val LUNO = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange m393vsb_osp */
      val M393VSB_OSP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Orange Mahpee */
      val MAHPEE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange mickey6 */
      val MICKEY6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange Neva_jet */
      val NEVA_JET = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Orange Neva_leaf */
      val NEVA_LEAF = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orange Neva_play */
      val NEVA_PLAY = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Orange Neva_Rise_S1 */
      val NEVA_RISE_S1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orange Neva_sparkle */
      val NEVA_SPARKLE = "spec:width=480,height=960,unit=px,dpi=200"

      /** Orange Neva_start */
      val NEVA_START = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orange Neva_zen */
      val NEVA_ZEN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Orange Nola_fun_3 */
      val NOLA_FUN_3 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Orange Nola_play */
      val NOLA_PLAY = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange Nola_play_plus */
      val NOLA_PLAY_PLUS = "spec:width=480,height=854,unit=px,dpi=200"

      /** Orange Nola-ultra */
      val NOLA_ULTRA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Orange Nola_Up */
      val NOLA_UP = "spec:width=480,height=854,unit=px,dpi=200"

      /** Orange Orange_Dive_71 */
      val ORANGE_DIVE_71 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange Orange_Neva_80 */
      val ORANGE_NEVA_80 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Orange Orange-Rise32 */
      val ORANGE_RISE32 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange Orange_Sego */
      val ORANGE_SEGO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Orange P635E40 */
      val P635E40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange Pixi3-4 */
      val PIXI3_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange Pixi4-4 */
      val PIXI4_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange PIXI4_5_4G */
      val PIXI4_5_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange Rise33 */
      val RISE33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Orange Rise_53 */
      val RISE_53 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Orange Rise_54 */
      val RISE_54 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orange Rise_55 */
      val RISE_55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Orange Sanza_plus */
      val SANZA_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** Orange Sanza_touch */
      val SANZA_TOUCH = "spec:width=480,height=800,unit=px,dpi=213"

      /** Orange Vec4G */
      val VEC4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Orange Yaris35_GSM */
      val YARIS35_GSM = "spec:width=320,height=480,unit=px,dpi=160"

  }
