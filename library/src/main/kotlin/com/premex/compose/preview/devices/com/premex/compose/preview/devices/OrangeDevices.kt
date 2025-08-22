package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

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
      /** DeviceSpec(manufacturer=Orange, code=Alto45, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Alto45, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ALTO45 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=BUZZ6T4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=BUZZ6T4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BUZZ6T4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Dive_70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Dive_70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DIVE_70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Dive_73, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Dive_73, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DIVE_73 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=DSB0010, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=DSB0010, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DSB0010 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=DSB0110, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=DSB0110, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DSB0110 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=DV8555-KPO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=DV8555-KPO,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8555_KPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=hwG535-L11, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=hwG535-L11, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HWG535_L11 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=hwG740-L00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=hwG740-L00, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HWG740_L00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=hwt1821l, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=hwt1821l, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HWT1821L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Orange, code=hwt1a21l, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=hwt1a21l, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HWT1A21L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Orange, code=KSTB7259, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=KSTB7259, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB7259 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Luno, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Luno, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LUNO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=m393vsb_osp, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=m393vsb_osp,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393VSB_OSP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Mahpee, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Mahpee, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MAHPEE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=mickey6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=mickey6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MICKEY6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Neva_jet, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_jet, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val NEVA_JET = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Orange, code=Neva_leaf, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_leaf, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NEVA_LEAF = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Neva_play, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_play, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val NEVA_PLAY = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Neva_Rise_S1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_Rise_S1,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val NEVA_RISE_S1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Neva_sparkle, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_sparkle,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val NEVA_SPARKLE = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Orange, code=Neva_start, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_start, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NEVA_START = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Neva_zen, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Neva_zen, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NEVA_ZEN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Nola_fun_3, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Nola_fun_3, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val NOLA_FUN_3 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Orange, code=Nola_play, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Nola_play, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NOLA_PLAY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Nola_play_plus, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Nola_play_plus,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val NOLA_PLAY_PLUS = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Orange, code=Nola-ultra, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Nola-ultra, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val NOLA_ULTRA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Nola_Up, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Nola_Up, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val NOLA_UP = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Orange, code=Orange_Dive_71, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Orange_Dive_71,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ORANGE_DIVE_71 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Orange_Neva_80, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Orange_Neva_80,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ORANGE_NEVA_80 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Orange, code=Orange-Rise32, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Orange-Rise32,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ORANGE_RISE32 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Orange_Sego, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Orange_Sego,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val ORANGE_SEGO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Orange, code=P635E40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=P635E40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P635E40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Pixi3-4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Pixi3-4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI3_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Pixi4-4, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Pixi4-4, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PIXI4_4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=PIXI4_5_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=PIXI4_5_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PIXI4_5_4G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Rise33, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Rise33, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RISE33 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Rise_53, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Rise_53, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val RISE_53 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Rise_54, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Rise_54, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RISE_54 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Rise_55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Rise_55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RISE_55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orange, code=Sanza_plus, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Sanza_plus, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SANZA_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Orange, code=Sanza_touch, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Sanza_touch,
      width=480, height=800, dpi=213, isGoogleDevice=false).code */
      val SANZA_TOUCH = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Orange, code=Vec4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Vec4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VEC4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orange, code=Yaris35_GSM, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orange, code=Yaris35_GSM,
      width=320, height=480, dpi=160, isGoogleDevice=false).code */
      val YARIS35_GSM = "spec:width=320,height=480,unit=px,dpi=160"

  }
