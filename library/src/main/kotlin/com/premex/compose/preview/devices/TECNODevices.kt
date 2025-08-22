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
      /** TECNO DP10A */
      val DP10A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TECNO DP7CPRO */
      val DP7CPRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TECNO DP7CPro-SGA1 */
      val DP7CPRO_SGA1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TECNO DP8D */
      val DP8D = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TECNO L8Lite */
      val L8LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO Phantom6 */
      val PHANTOM6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO Phantom6-Plus */
      val PHANTOM6_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO PP7E-DLA1 */
      val PP7E_DLA1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TECNO TECNO-A571LS */
      val TECNO_A571LS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TECNO TECNO-AB7 */
      val TECNO_AB7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TECNO TECNO-AC8 */
      val TECNO_AC8 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TECNO TECNO-AD10 */
      val TECNO_AD10 = "spec:width=2000,height=2296,unit=px,dpi=480"

      /** TECNO TECNO-AD11 */
      val TECNO_AD11 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** TECNO TECNO-AD8 */
      val TECNO_AD8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-AD9 */
      val TECNO_AD9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-AE10 */
      val TECNO_AE10 = "spec:width=2000,height=2296,unit=px,dpi=480"

      /** TECNO TECNO-AE11 */
      val TECNO_AE11 = "spec:width=1080,height=2640,unit=px,dpi=480"

      /** TECNO TECNO-AX8 */
      val TECNO_AX8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO TECNO-B1 */
      val TECNO_B1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-B1f */
      val TECNO_B1F = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-B1g */
      val TECNO_B1G = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-B1p */
      val TECNO_B1P = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-B1S */
      val TECNO_B1S = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BA2 */
      val TECNO_BA2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BB2 */
      val TECNO_BB2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BB4 */
      val TECNO_BB4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-BB4k */
      val TECNO_BB4K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-BC1 */
      val TECNO_BC1 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** TECNO TECNO-BC1s */
      val TECNO_BC1S = "spec:width=540,height=1200,unit=px,dpi=240"

      /** TECNO TECNO-BC2 */
      val TECNO_BC2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BC2c */
      val TECNO_BC2C = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BC3 */
      val TECNO_BC3 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** TECNO TECNO-BD1 */
      val TECNO_BD1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TECNO TECNO-BD2 */
      val TECNO_BD2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-BD2d */
      val TECNO_BD2D = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-BD2p */
      val TECNO_BD2P = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-BD3 */
      val TECNO_BD3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-BD4 */
      val TECNO_BD4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-BD4i */
      val TECNO_BD4I = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-BE6-R2 */
      val TECNO_BE6_R2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-BE7 */
      val TECNO_BE7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-BE8 */
      val TECNO_BE8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BE8i */
      val TECNO_BE8I = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BF6 */
      val TECNO_BF6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BF7 */
      val TECNO_BF7 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BF7h */
      val TECNO_BF7H = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BF7n */
      val TECNO_BF7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BF7s */
      val TECNO_BF7S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG6 */
      val TECNO_BG6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG6h */
      val TECNO_BG6H = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG6i */
      val TECNO_BG6I = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG6m */
      val TECNO_BG6M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG6s */
      val TECNO_BG6S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG7 */
      val TECNO_BG7 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-BG7n */
      val TECNO_BG7N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-C5 */
      val TECNO_C5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-C7 */
      val TECNO_C7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-C8 */
      val TECNO_C8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-C9 */
      val TECNO_C9 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO TECNO-CA6 */
      val TECNO_CA6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-CA7 */
      val TECNO_CA7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-CA8 */
      val TECNO_CA8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** TECNO TECNO-CB7 */
      val TECNO_CB7 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TECNO TECNO-CB7j */
      val TECNO_CB7J = "spec:width=720,height=1520,unit=px,dpi=320"

      /** TECNO TECNO-CC6 */
      val TECNO_CC6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CC7 */
      val TECNO_CC7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CC7S */
      val TECNO_CC7S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CC9 */
      val TECNO_CC9 = "spec:width=720,height=1548,unit=px,dpi=320"

      /** TECNO TECNO-CD6 */
      val TECNO_CD6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CD6j */
      val TECNO_CD6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CD7 */
      val TECNO_CD7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CD8 */
      val TECNO_CD8 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TECNO TECNO-CD8j */
      val TECNO_CD8J = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** TECNO TECNO-CE7 */
      val TECNO_CE7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-CE7j */
      val TECNO_CE7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-CE8 */
      val TECNO_CE8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-CE9 */
      val TECNO_CE9 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CE9h */
      val TECNO_CE9H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CF7 */
      val TECNO_CF7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-CF7k */
      val TECNO_CF7K = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-CF8 */
      val TECNO_CF8 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-CG6 */
      val TECNO_CG6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CG6j */
      val TECNO_CG6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-CG7 */
      val TECNO_CG7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CG7n */
      val TECNO_CG7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CG8 */
      val TECNO_CG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CG8h */
      val TECNO_CG8H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH6 */
      val TECNO_CH6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH6h */
      val TECNO_CH6H = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH6i */
      val TECNO_CH6I = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH6IS */
      val TECNO_CH6IS = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH6n */
      val TECNO_CH6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH7 */
      val TECNO_CH7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH7n */
      val TECNO_CH7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CH9 */
      val TECNO_CH9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CH9n */
      val TECNO_CH9N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CI6 */
      val TECNO_CI6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CI6n */
      val TECNO_CI6N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CI7n */
      val TECNO_CI7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CI8 */
      val TECNO_CI8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CI8n */
      val TECNO_CI8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-CK6 */
      val TECNO_CK6 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK6n */
      val TECNO_CK6N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK6ns */
      val TECNO_CK6NS = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK7n */
      val TECNO_CK7N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK8n */
      val TECNO_CK8N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK8nB */
      val TECNO_CK8NB = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CK9n */
      val TECNO_CK9N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-CL6 */
      val TECNO_CL6 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL6k */
      val TECNO_CL6K = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL6s */
      val TECNO_CL6S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL7 */
      val TECNO_CL7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL7k */
      val TECNO_CL7K = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL7s */
      val TECNO_CL7S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CL8 */
      val TECNO_CL8 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** TECNO TECNO-CL9 */
      val TECNO_CL9 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** TECNO TECNO-CLA5 */
      val TECNO_CLA5 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CLA6 */
      val TECNO_CLA6 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-CM5 */
      val TECNO_CM5 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** TECNO TECNO-CM6 */
      val TECNO_CM6 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** TECNO TECNO-CM7 */
      val TECNO_CM7 = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** TECNO TECNO-CM8 */
      val TECNO_CM8 = "spec:width=1260,height=2800,unit=px,dpi=520"

      /** TECNO TECNO-CX */
      val TECNO_CX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO TECNO-CX-Air */
      val TECNO_CX_AIR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-F1-PRO */
      val TECNO_F1_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-F2 */
      val TECNO_F2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-F2LTE */
      val TECNO_F2LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-F3 */
      val TECNO_F3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-F3-13M */
      val TECNO_F3_13M = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-F4 */
      val TECNO_F4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-F4Pro */
      val TECNO_F4PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-i3 */
      val TECNO_I3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-i3-Pro */
      val TECNO_I3_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-i5 */
      val TECNO_I5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-i5-Pro */
      val TECNO_I5_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-i7 */
      val TECNO_I7 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO TECNO-IA5 */
      val TECNO_IA5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-ID3k */
      val TECNO_ID3K = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-ID5 */
      val TECNO_ID5 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-ID5a */
      val TECNO_ID5A = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-ID5b */
      val TECNO_ID5B = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-ID6 */
      val TECNO_ID6 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-IN1 */
      val TECNO_IN1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-IN1-Pro */
      val TECNO_IN1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-IN2 */
      val TECNO_IN2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-IN3 */
      val TECNO_IN3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-IN5 */
      val TECNO_IN5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-IN6 */
      val TECNO_IN6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-J5 */
      val TECNO_J5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-J8 */
      val TECNO_J8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-K7 */
      val TECNO_K7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-K8 */
      val TECNO_K8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-K9 */
      val TECNO_K9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-KA6 */
      val TECNO_KA6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KA7-GO */
      val TECNO_KA7_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KA7-O */
      val TECNO_KA7_O = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KA9 */
      val TECNO_KA9 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KB2 */
      val TECNO_KB2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KB2h */
      val TECNO_KB2H = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KB2j */
      val TECNO_KB2J = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-KB3 */
      val TECNO_KB3 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-KB7 */
      val TECNO_KB7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-KB7j */
      val TECNO_KB7J = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-KB8 */
      val TECNO_KB8 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-KC1 */
      val TECNO_KC1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-KC1j */
      val TECNO_KC1J = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-KC2 */
      val TECNO_KC2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KC2j */
      val TECNO_KC2J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KC3 */
      val TECNO_KC3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KC6 */
      val TECNO_KC6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-KC6S */
      val TECNO_KC6S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TECNO TECNO-KC8 */
      val TECNO_KC8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KC8S */
      val TECNO_KC8S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KD6 */
      val TECNO_KD6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-KD7 */
      val TECNO_KD7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KD7h */
      val TECNO_KD7H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KE5 */
      val TECNO_KE5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KE5j */
      val TECNO_KE5J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KE5k */
      val TECNO_KE5K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KE5S */
      val TECNO_KE5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KE6 */
      val TECNO_KE6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-KE6j */
      val TECNO_KE6J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-KF6 */
      val TECNO_KF6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6h */
      val TECNO_KF6H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6i */
      val TECNO_KF6I = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6j */
      val TECNO_KF6J = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6k */
      val TECNO_KF6K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6ks */
      val TECNO_KF6KS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6m */
      val TECNO_KF6M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6n */
      val TECNO_KF6N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF6p */
      val TECNO_KF6P = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KF7j */
      val TECNO_KF7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-KF8 */
      val TECNO_KF8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KG5 */
      val TECNO_KG5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KG5h */
      val TECNO_KG5H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KG5j */
      val TECNO_KG5J = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG5k */
      val TECNO_KG5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG5ks */
      val TECNO_KG5KS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG5m */
      val TECNO_KG5M = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KG5p */
      val TECNO_KG5P = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG5q */
      val TECNO_KG5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG6 */
      val TECNO_KG6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KG6k */
      val TECNO_KG6K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KG6P */
      val TECNO_KG6P = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO TECNO-KG7 */
      val TECNO_KG7 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO TECNO-KG7n */
      val TECNO_KG7N = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO TECNO-KG8 */
      val TECNO_KG8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KH6 */
      val TECNO_KH6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KH7n */
      val TECNO_KH7N = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO TECNO-KH7S */
      val TECNO_KH7S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** TECNO TECNO-KI5k */
      val TECNO_KI5K = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KI5m */
      val TECNO_KI5M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KI5n */
      val TECNO_KI5N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KI5q */
      val TECNO_KI5Q = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KI5qs */
      val TECNO_KI5QS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KI7 */
      val TECNO_KI7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KI7s */
      val TECNO_KI7S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KI8 */
      val TECNO_KI8 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KJ5 */
      val TECNO_KJ5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KJ5n */
      val TECNO_KJ5N = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KJ5s */
      val TECNO_KJ5S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** TECNO TECNO-KJ6 */
      val TECNO_KJ6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KJ7 */
      val TECNO_KJ7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-KJ7s */
      val TECNO_KJ7S = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-KJ8 */
      val TECNO_KJ8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KJ8s */
      val TECNO_KJ8S = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KL4 */
      val TECNO_KL4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL4s */
      val TECNO_KL4S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL5 */
      val TECNO_KL5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL5n */
      val TECNO_KL5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL5s */
      val TECNO_KL5S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL6 */
      val TECNO_KL6 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-KL7 */
      val TECNO_KL7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-KL8 */
      val TECNO_KL8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL8h */
      val TECNO_KL8H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL8hs */
      val TECNO_KL8HS = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KL8s */
      val TECNO_KL8S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KM4 */
      val TECNO_KM4 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** TECNO TECNO-KM4k */
      val TECNO_KM4K = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KM5 */
      val TECNO_KM5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KM5n */
      val TECNO_KM5N = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-KM6 */
      val TECNO_KM6 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** TECNO TECNO-KM7 */
      val TECNO_KM7 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** TECNO TECNO-KM9 */
      val TECNO_KM9 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** TECNO TECNO-L5 */
      val TECNO_L5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-L6502S */
      val TECNO_L6502S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-L8 */
      val TECNO_L8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-L9 */
      val TECNO_L9 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-L9Plus */
      val TECNO_L9PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-LA6 */
      val TECNO_LA6 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-LA7 */
      val TECNO_LA7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-LA7-13M */
      val TECNO_LA7_13M = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-LB6 */
      val TECNO_LB6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-LB7 */
      val TECNO_LB7 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** TECNO TECNO-LC6 */
      val TECNO_LC6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-LC6a */
      val TECNO_LC6A = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-LC7 */
      val TECNO_LC7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LC8 */
      val TECNO_LC8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LD7 */
      val TECNO_LD7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LD7j */
      val TECNO_LD7J = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LE6 */
      val TECNO_LE6 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LE7 */
      val TECNO_LE7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LE7n */
      val TECNO_LE7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LE8 */
      val TECNO_LE8 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LF7 */
      val TECNO_LF7 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LF7n */
      val TECNO_LF7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LG6n */
      val TECNO_LG6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LG7n */
      val TECNO_LG7N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LG8n */
      val TECNO_LG8N = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** TECNO TECNO-LH6n */
      val TECNO_LH6N = "spec:width=720,height=1640,unit=px,dpi=320"

      /** TECNO TECNO-LH7n */
      val TECNO_LH7N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LH8n */
      val TECNO_LH8N = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** TECNO TECNO-LI7 */
      val TECNO_LI7 = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** TECNO TECNO-LJ6 */
      val TECNO_LJ6 = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** TECNO TECNO-LJ7 */
      val TECNO_LJ7 = "spec:width=1080,height=2460,unit=px,dpi=440"

      /** TECNO TECNO-LJ8 */
      val TECNO_LJ8 = "spec:width=1224,height=2720,unit=px,dpi=480"

      /** TECNO TECNO-LJ8k */
      val TECNO_LJ8K = "spec:width=1080,height=2436,unit=px,dpi=440"

      /** TECNO TECNO-LJ9 */
      val TECNO_LJ9 = "spec:width=1080,height=2400,unit=px,dpi=520"

      /** TECNO TECNO_N2S */
      val TECNO_N2S = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-N6 */
      val TECNO_N6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-N6S */
      val TECNO_N6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-N8 */
      val TECNO_N8 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-N8S */
      val TECNO_N8S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-P701 */
      val TECNO_P701 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** TECNO TECNO-P702 */
      val TECNO_P702 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** TECNO TECNO-P703 */
      val TECNO_P703 = "spec:width=600,height=1024,unit=px,dpi=240"

      /** TECNO TECNO-P704 */
      val TECNO_P704 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** TECNO TECNO-P704a */
      val TECNO_P704A = "spec:width=600,height=1024,unit=px,dpi=213"

      /** TECNO TECNO-P904 */
      val TECNO_P904 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TECNO TECNO-PHANTOM5 */
      val TECNO_PHANTOM5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** TECNO TECNO-PP7FPro */
      val TECNO_PP7FPRO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TECNO TECNO-PR651 */
      val TECNO_PR651 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-PR651E */
      val TECNO_PR651E = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-PR651H */
      val TECNO_PR651H = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TECNO TECNO-R6 */
      val TECNO_R6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-R8 */
      val TECNO_R8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-RA6 */
      val TECNO_RA6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-RA8 */
      val TECNO_RA8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** TECNO TECNO-RB6S */
      val TECNO_RB6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-RB7S */
      val TECNO_RB7S = "spec:width=480,height=960,unit=px,dpi=213"

      /** TECNO TECNO-RB8S */
      val TECNO_RB8S = "spec:width=480,height=960,unit=px,dpi=240"

      /** TECNO TECNO-RC6 */
      val TECNO_RC6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-S1 */
      val TECNO_S1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-S1-Pro */
      val TECNO_S1_PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-S6S */
      val TECNO_S6S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-SA1 */
      val TECNO_SA1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-SA1S-PRO */
      val TECNO_SA1S_PRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-SA2S */
      val TECNO_SA2S = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-SA6 */
      val TECNO_SA6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-SA7S */
      val TECNO_SA7S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-SC7S */
      val TECNO_SC7S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-T1101 */
      val TECNO_T1101 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** TECNO TECNO_W1 */
      val TECNO_W1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO_W2 */
      val TECNO_W2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-W3 */
      val TECNO_W3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-W3LTE */
      val TECNO_W3LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-W3Pro */
      val TECNO_W3PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO_W4 */
      val TECNO_W4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-W5 */
      val TECNO_W5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-W5006S */
      val TECNO_W5006S = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-WX3 */
      val TECNO_WX3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-WX3FLTE */
      val TECNO_WX3FLTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-WX3LTE */
      val TECNO_WX3LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-WX3P */
      val TECNO_WX3P = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO TECNO-WX4 */
      val TECNO_WX4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-WX4-Pro */
      val TECNO_WX4_PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** TECNO TECNO-Y2 */
      val TECNO_Y2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** TECNO TECNO-Y6 */
      val TECNO_Y6 = "spec:width=480,height=854,unit=px,dpi=240"

      /** TECNO W5Lite */
      val W5LITE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
