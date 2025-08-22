package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECNO device specifications for Android Compose previews.
 *
 * This extension provides TECNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECNO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECNO: Any
  get() = object {
      /** DeviceSpec(manufacturer=TECNO, code=DP10A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=DP10A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DP10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=DP7CPRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=DP7CPRO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DP7CPRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=DP7CPro-SGA1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=DP7CPro-SGA1,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DP7CPRO_SGA1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=DP8D, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=DP8D, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DP8D = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=L8Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=L8Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L8LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=Phantom6, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=Phantom6, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PHANTOM6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=Phantom6-Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=Phantom6-Plus,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val PHANTOM6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=PP7E-DLA1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=PP7E-DLA1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val PP7E_DLA1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-A571LS, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-A571LS,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val TECNO_A571LS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AB7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AB7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TECNO_AB7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AC8, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AC8, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TECNO_AC8 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AD10, width=2000, height=2296, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AD10, width=2000,
      height=2296, dpi=480, isGoogleDevice=false).code */
      val TECNO_AD10 = "spec:width=2000,height=2296,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AD11, width=1080, height=2640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AD11, width=1080,
      height=2640, dpi=480, isGoogleDevice=false).code */
      val TECNO_AD11 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AD8, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AD8, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_AD8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AD9, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AD9, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_AD9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AE10, width=2000, height=2296, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AE10, width=2000,
      height=2296, dpi=480, isGoogleDevice=false).code */
      val TECNO_AE10 = "spec:width=2000,height=2296,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AE11, width=1080, height=2640, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AE11, width=1080,
      height=2640, dpi=480, isGoogleDevice=false).code */
      val TECNO_AE11 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-AX8, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-AX8, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TECNO_AX8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-B1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-B1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_B1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-B1f, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-B1f, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_B1F = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-B1g, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-B1g, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_B1G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-B1p, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-B1p, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_B1P = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-B1S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-B1S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_B1S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BA2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BA2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_BA2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BB2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BB2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_BB2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BB4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BB4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_BB4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BB4k, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BB4k, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_BB4K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BC1, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BC1, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val TECNO_BC1 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BC1s, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BC1s, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val TECNO_BC1S = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BC2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BC2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_BC2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BC2c, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BC2c, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_BC2C = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BC3, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BC3, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val TECNO_BC3 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD2d, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD2d, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD2D = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD2p, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD2p, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD2P = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BD4i, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BD4i, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_BD4I = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BE6-R2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BE6-R2,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_BE6_R2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BE7, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BE7, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_BE7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BE8, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BE8, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BE8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BE8i, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BE8i, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BE8I = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BF6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BF6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BF6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BF7, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BF7, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BF7 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BF7h, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BF7h, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BF7H = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BF7n, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BF7n, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BF7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BF7s, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BF7s, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BF7S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG6h, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG6h, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG6H = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG6i, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG6i, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG6I = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG6m, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG6m, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG6M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG6s, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG6s, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG6S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG7, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG7, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG7 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-BG7n, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-BG7n, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_BG7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-C5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-C5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_C5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-C7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-C7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_C7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-C8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-C8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_C8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-C9, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-C9, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TECNO_C9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CA6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CA6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_CA6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CA7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CA7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_CA7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CA8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CA8, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val TECNO_CA8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CB7, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CB7, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TECNO_CB7 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CB7j, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CB7j, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TECNO_CB7J = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CC6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CC6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CC6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CC7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CC7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CC7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CC7S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CC7S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CC7S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CC9, width=720, height=1548, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CC9, width=720,
      height=1548, dpi=320, isGoogleDevice=false).code */
      val TECNO_CC9 = "spec:width=720,height=1548,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CD6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CD6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CD6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CD6j, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CD6j, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CD6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CD7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CD7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CD7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CD8, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CD8, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TECNO_CD8 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CD8j, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CD8j, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val TECNO_CD8J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CE7, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CE7, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_CE7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CE7j, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CE7j, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_CE7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CE8, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CE8, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_CE8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CE9, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CE9, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CE9 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CE9h, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CE9h, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CE9H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CF7, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CF7, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_CF7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CF7k, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CF7k, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_CF7K = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CF8, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CF8, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_CF8 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CG6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG6j, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG6j, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_CG6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CG7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CG7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CG8h, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CG8h, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CG8H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH6h, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH6h, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH6H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH6i, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH6i, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH6I = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH6IS, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH6IS,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH6IS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH6n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH6n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH9, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH9, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CH9n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CH9n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CH9N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CI6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CI6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CI6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CI6n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CI6n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CI6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CI7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CI7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CI7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CI8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CI8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CI8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CI8n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CI8n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_CI8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK6, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK6, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK6 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK6n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK6n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK6N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK6ns, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK6ns,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK6NS = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK7n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK7n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK7N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK8n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK8n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK8N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK8nB, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK8nB,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK8NB = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CK9n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CK9n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_CK9N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL6, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL6, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL6 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL6k, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL6k, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL6K = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL6s, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL6s, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL6S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL7, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL7, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL7k, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL7k, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL7K = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL7s, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL7s, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CL7S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL8, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL8, width=1080,
      height=2436, dpi=440, isGoogleDevice=false).code */
      val TECNO_CL8 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CL9, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CL9, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val TECNO_CL9 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CLA5, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CLA5, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CLA5 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CLA6, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CLA6, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_CLA6 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CM5, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CM5, width=1080,
      height=2436, dpi=440, isGoogleDevice=false).code */
      val TECNO_CM5 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CM6, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CM6, width=1080,
      height=2436, dpi=440, isGoogleDevice=false).code */
      val TECNO_CM6 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CM7, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CM7, width=1080,
      height=2436, dpi=440, isGoogleDevice=false).code */
      val TECNO_CM7 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CM8, width=1260, height=2800, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CM8, width=1260,
      height=2800, dpi=520, isGoogleDevice=false).code */
      val TECNO_CM8 = "spec:width=1260,height=2800,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CX, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CX, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TECNO_CX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-CX-Air, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-CX-Air,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_CX_AIR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F1-PRO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F1-PRO,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_F1_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_F2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F2LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F2LTE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_F2LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_F3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F3-13M, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F3-13M,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_F3_13M = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_F4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-F4Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-F4Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_F4PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-i3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-i3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_I3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-i3-Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-i3-Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_I3_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-i5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-i5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_I5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-i5-Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-i5-Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_I5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-i7, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-i7, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TECNO_I7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IA5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IA5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IA5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-ID3k, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-ID3k, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_ID3K = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-ID5, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-ID5, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_ID5 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-ID5a, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-ID5a, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_ID5A = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-ID5b, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-ID5b, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_ID5B = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-ID6, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-ID6, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_ID6 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IN1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN1-Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN1-Pro,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IN1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_IN2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IN3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IN5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-IN6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-IN6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_IN6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-J5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-J5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_J5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-J8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-J8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_J8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-K7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-K7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_K7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-K8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-K8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_K8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-K9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-K9, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_K9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KA6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KA6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KA6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KA7-GO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KA7-GO,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KA7_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KA7-O, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KA7-O, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KA7_O = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KA9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KA9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KA9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB2h, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB2h, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB2H = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB2j, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB2j, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB2J = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB3, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB3, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB3 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB7, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB7, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB7j, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB7j, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB7J = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KB8, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KB8, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_KB8 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC1j, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC1j, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC1J = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC2j, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC2j, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC2J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC6S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC6S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC6S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KC8S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KC8S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KC8S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KD6, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KD6, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_KD6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KD7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KD7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KD7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KD7h, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KD7h, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KD7H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE5j, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE5j, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE5J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE5k, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE5k, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE5K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE5S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE5S, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE6, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE6, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KE6j, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KE6j, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_KE6J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6h, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6h, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6i, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6i, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6I = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6j, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6j, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6k, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6k, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6ks, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6ks, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6KS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6m, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6m, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6n, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6n, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF6p, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF6p, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF6P = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF7j, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF7j, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KF8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KF8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KF8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5h, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5h, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5j, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5j, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5J = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5k, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5k, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5ks, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5ks, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5KS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5m, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5m, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5p, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5p, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5P = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG5q, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG5q, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG6k, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG6k, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KG6K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG6P, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG6P, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_KG6P = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG7, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG7, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_KG7 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG7n, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG7n, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_KG7N = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KG8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KG8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KH6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KH6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KH6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KH7n, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KH7n, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_KH7N = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KH7S, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KH7S, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val TECNO_KH7S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI5k, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI5k, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI5m, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI5m, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI5M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI5n, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI5n, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI5N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI5q, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI5q, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI5qs, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI5qs, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI5QS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KI7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI7s, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI7s, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KI7S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KI8, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KI8, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KI8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KJ5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5n, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5n, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KJ5N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5s, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ5s, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val TECNO_KJ5S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KJ6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ7, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ7, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_KJ7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ7s, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ7s, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_KJ7S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KJ8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KJ8s, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KJ8s, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KJ8S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL4s, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL4s, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL4S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL5n, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL5n, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL5s, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL5s, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL6, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL6, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_KL6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL7, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL7, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_KL7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL8, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL8, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL8h, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL8h, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL8H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL8hs, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL8hs, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL8HS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KL8s, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KL8s, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KL8S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM4, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM4, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val TECNO_KM4 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM4k, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM4k, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KM4K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KM5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM5n, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM5n, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_KM5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM6, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM6, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val TECNO_KM6 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM7, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM7, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val TECNO_KM7 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-KM9, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-KM9, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val TECNO_KM9 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-L5, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-L5, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_L5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-L6502S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-L6502S,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_L6502S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-L8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-L8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_L8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-L9, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-L9, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_L9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-L9Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-L9Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_L9PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LA6, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LA6, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_LA6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LA7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LA7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_LA7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LA7-13M, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LA7-13M,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_LA7_13M = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LB6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LB6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_LB6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LB7, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LB7, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val TECNO_LB7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LC6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LC6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_LC6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LC6a, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LC6a, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_LC6A = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LC7, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LC7, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LC7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LC8, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LC8, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LC8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LD7, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LD7, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LD7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LD7j, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LD7j, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LD7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LE6, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LE6, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LE6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LE7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LE7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LE7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LE7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LE7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LE7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LE8, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LE8, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LE8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LF7, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LF7, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LF7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LF7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LF7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LF7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LG6n, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LG6n, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LG6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LG7n, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LG7n, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LG7N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LG8n, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LG8n, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val TECNO_LG8N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LH6n, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LH6n, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val TECNO_LH6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LH7n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LH7n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LH7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LH8n, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LH8n, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val TECNO_LH8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LI7, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LI7, width=1080,
      height=2436, dpi=480, isGoogleDevice=false).code */
      val TECNO_LI7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LJ6, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LJ6, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val TECNO_LJ6 = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LJ7, width=1080, height=2460, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LJ7, width=1080,
      height=2460, dpi=440, isGoogleDevice=false).code */
      val TECNO_LJ7 = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LJ8, width=1224, height=2720, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LJ8, width=1224,
      height=2720, dpi=480, isGoogleDevice=false).code */
      val TECNO_LJ8 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LJ8k, width=1080, height=2436, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LJ8k, width=1080,
      height=2436, dpi=440, isGoogleDevice=false).code */
      val TECNO_LJ8K = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-LJ9, width=1080, height=2400, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-LJ9, width=1080,
      height=2400, dpi=520, isGoogleDevice=false).code */
      val TECNO_LJ9 = "spec:width=1080,height=2400,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO_N2S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO_N2S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_N2S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-N6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-N6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_N6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-N6S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-N6S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_N6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-N8, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-N8, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_N8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-N8S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-N8S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_N8S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P701, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P701, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TECNO_P701 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P702, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P702, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TECNO_P702 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P703, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P703, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val TECNO_P703 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P704, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P704, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TECNO_P704 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P704a, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P704a, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TECNO_P704A = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-P904, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-P904, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TECNO_P904 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-PHANTOM5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-PHANTOM5,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val TECNO_PHANTOM5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-PP7FPro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-PP7FPro,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val TECNO_PP7FPRO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-PR651, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-PR651, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_PR651 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-PR651E, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-PR651E,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_PR651E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-PR651H, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-PR651H,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val TECNO_PR651H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-R6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-R6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_R6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-R8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-R8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_R8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RA6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RA6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_RA6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RA8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RA8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TECNO_RA8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RB6S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RB6S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_RB6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RB7S, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RB7S, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val TECNO_RB7S = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RB8S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RB8S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TECNO_RB8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-RC6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-RC6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_RC6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-S1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-S1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_S1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-S1-Pro, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-S1-Pro,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_S1_PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-S6S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-S6S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_S6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SA1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SA1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_SA1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SA1S-PRO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SA1S-PRO,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_SA1S_PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SA2S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SA2S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_SA2S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SA6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SA6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_SA6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SA7S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SA7S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_SA7S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-SC7S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-SC7S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_SC7S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-T1101, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-T1101,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TECNO_T1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO_W1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO_W1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_W1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO_W2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO_W2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_W2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-W3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-W3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_W3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-W3LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-W3LTE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_W3LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-W3Pro, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-W3Pro, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_W3PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO_W4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO_W4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_W4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-W5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-W5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_W5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-W5006S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-W5006S,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_W5006S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_WX3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX3FLTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX3FLTE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_WX3FLTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX3LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX3LTE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_WX3LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX3P, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX3P, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_WX3P = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_WX4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-WX4-Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-WX4-Pro,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TECNO_WX4_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-Y2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-Y2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TECNO_Y2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=TECNO-Y6, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=TECNO-Y6, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val TECNO_Y6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TECNO, code=W5Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TECNO, code=W5Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val W5LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
