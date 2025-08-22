package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DOCOMO device specifications for Android Compose previews.
 *
 * This extension provides DOCOMO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DOCOMO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DOCOMO: Any
  get() = object {
      /** DeviceSpec(manufacturer=DOCOMO, code=DM-01H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=DM-01H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DM_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=DM-01J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=DM-01J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DM_01J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F01F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F01F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F01H, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F01H, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F01H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F01J, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F01J, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F01J = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F01K, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F01K, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F01L, width=720, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F01L, width=720,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val F01L = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02E, width=1080, height=1776, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02E, width=1080,
      height=1776, dpi=480, isGoogleDevice=false).code */
      val F02E = "spec:width=1080,height=1776,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02F, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02F, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F02F = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02G, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02G, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val F02G = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02H, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02H, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val F02H = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02K, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02K, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F02K = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F02L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F02L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F02L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F03F, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F03F, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F03F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F03G, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F03G, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F03G = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F03H, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F03H, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F03H = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F03K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F03K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F03K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F04E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F04E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F04E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F04G, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F04G, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val F04G = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=F04H, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F04H, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val F04H = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F04J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F04J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F04J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F04K, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F04K, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val F04K = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F05E, width=1128, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F05E, width=1128,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F05E = "spec:width=1128,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOCOMO, code=F05F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F05F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F05F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F05J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F05J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F05J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F06E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F06E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val F06E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F07E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F07E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F07E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F09E, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F09E, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val F09E = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOCOMO, code=F10D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F10D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val F10D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=F41A, width=1080, height=2220, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F41A, width=1080,
      height=2220, dpi=480, isGoogleDevice=false).code */
      val F41A = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=F42A, width=720, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F42A, width=720,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val F42A = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=DOCOMO, code=F51A, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F51A, width=1440,
      height=3120, dpi=560, isGoogleDevice=false).code */
      val F51A = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=DOCOMO, code=F52A, width=1080, height=2280, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=F52A, width=1080,
      height=2280, dpi=420, isGoogleDevice=false).code */
      val F52A = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=DOCOMO, code=Jerid, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=Jerid, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val JERID = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=N-02E, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=N-02E, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val N_02E = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DOCOMO, code=N-03E, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=N-03E, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val N_03E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=N-04E, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=N-04E, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val N_04E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=N-06E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=N-06E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N_06E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=N-07D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=N-07D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val N_07D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH02E, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH02E, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SH02E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH04E, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH04E, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SH04E = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH09D, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH09D, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SH09D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH10D, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH10D, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SH10D = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_01F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01FDQ, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01FDQ, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_01FDQ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_01G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_01H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01K, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01K, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_01K = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01L, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01L, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_01L = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-01M, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-01M, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SH_01M = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-02F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-02F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_02F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-02G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-02G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_02G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-02H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-02H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_02H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-02J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-02J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_02J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-02M, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-02M, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_02M = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-03G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-03G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_03G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-03J, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-03J, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SH_03J = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-03K, width=1440, height=3040, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-03K, width=1440,
      height=3040, dpi=640, isGoogleDevice=false).code */
      val SH_03K = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-04F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-04F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_04F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-04G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-04G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_04G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-04H, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-04H, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_04H = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-04L, width=1440, height=3120, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-04L, width=1440,
      height=3120, dpi=640, isGoogleDevice=false).code */
      val SH_04L = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-05F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-05F, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_05F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-05G, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-05G, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SH_05G = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-06E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-06E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_06E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-06F, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-06F, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SH_06F = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-07E, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-07E, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_07E = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-08E, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-08E, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SH_08E = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51A, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51A, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val SH_51A = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51B, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51B, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val SH_51B = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51C, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51C, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SH_51C = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51D, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51D, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val SH_51D = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51E, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51E, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SH_51E = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-51F, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-51F, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SH_51F = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-52C, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-52C, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val SH_52C = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-52D, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-52D, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SH_52D = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-52E, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-52E, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SH_52E = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-52F, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-52F, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SH_52F = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-53A, width=1080, height=2280, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-53A, width=1080,
      height=2280, dpi=440, isGoogleDevice=false).code */
      val SH_53A = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-53C, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-53C, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val SH_53C = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-53D, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-53D, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SH_53D = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-53E, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-53E, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val SH_53E = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-54B, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-54B, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val SH_54B = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-54D, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-54D, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val SH_54D = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=DOCOMO, code=SH-54E, width=1440, height=3120, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DOCOMO, code=SH-54E, width=1440,
      height=3120, dpi=520, isGoogleDevice=false).code */
      val SH_54E = "spec:width=1440,height=3120,unit=px,dpi=520"

  }
