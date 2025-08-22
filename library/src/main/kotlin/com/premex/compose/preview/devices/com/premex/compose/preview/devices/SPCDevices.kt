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
 * @Preview(device = Devices.SPC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SPC: Any
  get() = object {
      /** DeviceSpec(manufacturer=SPC, code=APOLO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=APOLO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val APOLO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=Blink_10_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Blink_10_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val BLINK_10_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=Discovery, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Discovery, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DISCOVERY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=DISCOVERY_2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=DISCOVERY_2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val DISCOVERY_2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=DISCOVERY_2_ME, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=DISCOVERY_2_ME,
      width=720, height=1600, dpi=480, isGoogleDevice=false).code */
      val DISCOVERY_2_ME = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SPC, code=DISCOVERY_3, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=DISCOVERY_3, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val DISCOVERY_3 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SPC, code=DISCOVERY_3_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=DISCOVERY_3_PRO,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val DISCOVERY_3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=Discovery_Pro, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Discovery_Pro,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val DISCOVERY_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SPC, code=Discovery_SE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Discovery_SE, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DISCOVERY_SE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY2-4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY2-4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY2_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY3G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY3G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY-2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY-2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY-2-MAX, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY-2-MAX, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_2_MAX = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_3 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GRAVITY_3G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3_4G, width=800, height=1332, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3_4G, width=800,
      height=1332, dpi=180, isGoogleDevice=false).code */
      val GRAVITY_3_4G = "spec:width=800,height=1332,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3_MINI, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3_MINI,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val GRAVITY_3_MINI = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3_PRO, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3_PRO, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_3_PRO = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_3_SE, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_3_SE, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_3_SE = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_4, width=800, height=1332, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_4, width=800,
      height=1332, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_4 = "spec:width=800,height=1332,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GRAVITY_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_4_PLUS, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_4_PLUS,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val GRAVITY_4_PLUS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_5_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_5_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GRAVITY_5_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_5_PRO, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_5_PRO,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val GRAVITY_5_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_5_SE_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_5_SE_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val GRAVITY_5_SE_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_6_10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_6_10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_6_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_6_11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_6_11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_6_11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=Gravity_Max, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Gravity_Max, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val GRAVITY_MAX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_OCTACORE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_OCTACORE,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_OCTACORE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY-PRO-2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY-PRO-2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_PRO_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY-SE, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY-SE, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val GRAVITY_SE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=GRAVITY-ULTIMATE-2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=GRAVITY-ULTIMATE-2,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val GRAVITY_ULTIMATE_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=heaven-10_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=heaven-10_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HEAVEN_10_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=L52, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L52, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=L52_Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L52_Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L52_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=L53, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L53, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L53 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=L56, width=240, height=282, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L56, width=240,
      height=282, dpi=120, isGoogleDevice=false).code */
      val L56 = "spec:width=240,height=282,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=SPC, code=L60, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L60, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=L60_Pro, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L60_Pro, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L60_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=L60_Turbo, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L60_Turbo, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L60_TURBO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=L70_Lite, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L70_Lite, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val L70_LITE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SPC, code=L80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=L80_S, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=L80_S, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val L80_S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=Lightyear, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=Lightyear, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LIGHTYEAR = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=LIGHTYEAR2-4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=LIGHTYEAR2-4G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LIGHTYEAR2_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=LIGHTYEAR-2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=LIGHTYEAR-2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LIGHTYEAR_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SPC, code=SMART_2, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SMART_2, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SMART_2 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=SMART_3, width=442, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SMART_3, width=442,
      height=960, dpi=220, isGoogleDevice=false).code */
      val SMART_3 = "spec:width=442,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=SPC, code=SMART_MAX_2, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SMART_MAX_2, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val SMART_MAX_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=SPC, code=SMART_PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SMART_PRO, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SMART_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SMART_ULTIMATE, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SMART_ULTIMATE,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val SMART_ULTIMATE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SPC_GEN, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_GEN, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SPC_GEN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SPC_GEN_LITE, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_GEN_LITE, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val SPC_GEN_LITE = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SPC, code=SPC_GEN_MAX, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_GEN_MAX, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SPC_GEN_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SPC_GEN_PLUS, width=600, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_GEN_PLUS, width=600,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SPC_GEN_PLUS = "spec:width=600,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SPC_L52X, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_L52X, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SPC_L52X = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=SPC_SMART, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_SMART, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SPC_SMART = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=SPC_SMART_LITE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_SMART_LITE,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val SPC_SMART_LITE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SPC, code=SPC_SMART_MAX, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_SMART_MAX, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SPC_SMART_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=SPC_SMART_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=SPC_SMART_PLUS,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val SPC_SMART_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=ZEUS_4G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=ZEUS_4G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ZEUS_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SPC, code=ZEUS_4G_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SPC, code=ZEUS_4G_PRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ZEUS_4G_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
