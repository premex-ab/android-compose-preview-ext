package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KDDI device specifications for Android Compose previews.
 *
 * This extension provides KDDI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kddi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kddi: Any
  get() = object {
      /** KDDI ANK */
      val ANK = "spec:width=720,height=1520,unit=px,dpi=280"

      /** KDDI b3 */
      val B3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KDDI b5 */
      val B5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KDDI BOL */
      val BOL = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** KDDI C02AS */
      val C02AS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KDDI C02AS5 */
      val C02AS5 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KDDI cv1 */
      val CV1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI dlxj */
      val DLXJ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI DQO */
      val DQO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KDDI elsa */
      val ELSA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** KDDI FJL22_jp_kdi */
      val FJL22_JP_KDI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI FJT21_jp_kdi */
      val FJT21_JP_KDI = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** KDDI FSP */
      val FSP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI g2 */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI g3 */
      val G3 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** KDDI GTQ */
      val GTQ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI H02ST1 */
      val H02ST1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KDDI HUR */
      val HUR = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** KDDI IVR */
      val IVR = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** KDDI joan */
      val JOAN = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** KDDI JSG */
      val JSG = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI JUD */
      val JUD = "spec:width=720,height=1612,unit=px,dpi=280"

      /** KDDI JWT */
      val JWT = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** KDDI K015 */
      val K015 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KDDI KXU */
      val KXU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYL22 */
      val KYL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYT31 */
      val KYT31 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KDDI KYV31 */
      val KYV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYV32 */
      val KYV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYV33 */
      val KYV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYV34 */
      val KYV34 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYV35 */
      val KYV35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYV36 */
      val KYV36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYV37 */
      val KYV37 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYY21 */
      val KYY21 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYY22 */
      val KYY22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI KYY23 */
      val KYY23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI KYY24 */
      val KYY24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI LYV */
      val LYV = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** KDDI MZW */
      val MZW = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI NAX */
      val NAX = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** KDDI OBY */
      val OBY = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** KDDI OJ6 */
      val OJ6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** KDDI p1 */
      val P1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** KDDI PCZ */
      val PCZ = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI QDA */
      val QDA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** KDDI RCL */
      val RCL = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** KDDI SCL22 */
      val SCL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SCL23 */
      val SCL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SCL24 */
      val SCL24 = "spec:width=1600,height=2560,unit=px,dpi=640"

      /** KDDI SCT21 */
      val SCT21 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** KDDI SCV31 */
      val SCV31 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** KDDI SCV32 */
      val SCV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SCV33 */
      val SCV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SCV35 */
      val SCV35 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** KDDI SCV36 */
      val SCV36 = "spec:width=1440,height=2960,unit=px,dpi=480"

      /** KDDI SCV37 */
      val SCV37 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** KDDI SCV38 */
      val SCV38 = "spec:width=1440,height=2960,unit=px,dpi=480"

      /** KDDI SCV39 */
      val SCV39 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** KDDI SCV40 */
      val SCV40 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** KDDI SCV41 */
      val SCV41 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** KDDI SCV42 */
      val SCV42 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** KDDI SCV43 */
      val SCV43 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** KDDI SCV43-j */
      val SCV43_J = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** KDDI SCV44 */
      val SCV44 = "spec:width=1536,height=2152,unit=px,dpi=420"

      /** KDDI SCV45 */
      val SCV45 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** KDDI SCV46 */
      val SCV46 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** KDDI SHL21 */
      val SHL21 = "spec:width=720,height=1184,unit=px,dpi=320"

      /** KDDI SHL22 */
      val SHL22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI SHL23 */
      val SHL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHL24 */
      val SHL24 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHL25 */
      val SHL25 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHT21 */
      val SHT21 = "spec:width=800,height=1216,unit=px,dpi=213"

      /** KDDI SHT22 */
      val SHT22 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** KDDI SHV31 */
      val SHV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHV32 */
      val SHV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHV33 */
      val SHV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHV34 */
      val SHV34 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SHV35 */
      val SHV35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI SHV36 */
      val SHV36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI SOG01 */
      val SOG01 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** KDDI SOG02 */
      val SOG02 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOG03 */
      val SOG03 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** KDDI SOG04 */
      val SOG04 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOG05 */
      val SOG05 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOG06 */
      val SOG06 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** KDDI SOG07 */
      val SOG07 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOG08 */
      val SOG08 = "spec:width=720,height=1496,unit=px,dpi=300"

      /** KDDI SOG09 */
      val SOG09 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** KDDI SOG10 */
      val SOG10 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** KDDI SOG11 */
      val SOG11 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** KDDI SOG12 */
      val SOG12 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** KDDI SOG13 */
      val SOG13 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** KDDI SOG14 */
      val SOG14 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** KDDI SOL21 */
      val SOL21 = "spec:width=720,height=1184,unit=px,dpi=320"

      /** KDDI SOL22 */
      val SOL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOL23 */
      val SOL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOL24 */
      val SOL24 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KDDI SOL25 */
      val SOL25 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOL26 */
      val SOL26 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOT21 */
      val SOT21 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** KDDI SOT31 */
      val SOT31 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** KDDI SOV31 */
      val SOV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV32 */
      val SOV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV33 */
      val SOV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV34 */
      val SOV34 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV35 */
      val SOV35 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV36 */
      val SOV36 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** KDDI SOV37 */
      val SOV37 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI SOV38 */
      val SOV38 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** KDDI SOV39 */
      val SOV39 = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** KDDI SOV40 */
      val SOV40 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** KDDI SOV41 */
      val SOV41 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOV42 */
      val SOV42 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI SOV43 */
      val SOV43 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** KDDI sti6030d111 */
      val STI6030D111 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KDDI TGD */
      val TGD = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** KDDI VIF */
      val VIF = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** KDDI WJG */
      val WJG = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** KDDI XIJ */
      val XIJ = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** KDDI XKH */
      val XKH = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** KDDI XQ-FS */
      val XQ_FS = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** KDDI YLI */
      val YLI = "spec:width=720,height=1520,unit=px,dpi=280"

      /** KDDI zee */
      val ZEE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KDDI ZKO */
      val ZKO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
