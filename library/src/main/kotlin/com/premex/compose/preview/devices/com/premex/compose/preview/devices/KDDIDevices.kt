package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KDDI device specifications for Android Compose previews.
 *
 * This extension provides KDDI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KDDI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KDDI: Any
  get() = object {
      /** DeviceSpec(manufacturer=KDDI, code=ANK, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=ANK, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val ANK = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KDDI, code=b3, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=b3, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val B3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=b5, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=b5, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val B5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KDDI, code=BOL, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=BOL, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val BOL = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=KDDI, code=C02AS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=C02AS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C02AS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=C02AS5, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=C02AS5, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val C02AS5 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=cv1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=cv1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CV1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=dlxj, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=dlxj, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DLXJ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=DQO, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=DQO, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val DQO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=elsa, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=elsa, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val ELSA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=FJL22_jp_kdi, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=FJL22_jp_kdi,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val FJL22_JP_KDI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=FJT21_jp_kdi, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=FJT21_jp_kdi,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val FJT21_JP_KDI = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=FSP, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=FSP, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FSP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=g2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=g2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=g3, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=g3, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val G3 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=GTQ, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=GTQ, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val GTQ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=H02ST1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=H02ST1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val H02ST1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=HUR, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=HUR, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val HUR = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=IVR, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=IVR, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val IVR = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=KDDI, code=joan, width=1440, height=2880, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=joan, width=1440,
      height=2880, dpi=640, isGoogleDevice=false).code */
      val JOAN = "spec:width=1440,height=2880,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=JSG, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=JSG, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val JSG = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=JUD, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=JUD, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val JUD = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KDDI, code=JWT, width=1080, height=2032, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=JWT, width=1080,
      height=2032, dpi=480, isGoogleDevice=false).code */
      val JWT = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=K015, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=K015, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K015 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KXU, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KXU, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KXU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYL22, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYL22, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYT31, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYT31, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KYT31 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYV31, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV31, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYV32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYV33, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV33, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYV34, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV34, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV34 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYV35, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV35, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYV36, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV36, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYV37, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYV37, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV37 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYY21, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYY21, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYY21 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYY22, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYY22, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYY22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=KYY23, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYY23, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYY23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=KYY24, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=KYY24, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYY24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=LYV, width=1440, height=3040, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=LYV, width=1440,
      height=3040, dpi=640, isGoogleDevice=false).code */
      val LYV = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=MZW, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=MZW, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MZW = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=NAX, width=1440, height=3120, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=NAX, width=1440,
      height=3120, dpi=640, isGoogleDevice=false).code */
      val NAX = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=OBY, width=1080, height=2220, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=OBY, width=1080,
      height=2220, dpi=480, isGoogleDevice=false).code */
      val OBY = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=OJ6, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=OJ6, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val OJ6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=p1, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=p1, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val P1 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=PCZ, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=PCZ, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val PCZ = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=QDA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=QDA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val QDA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=RCL, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=RCL, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val RCL = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=KDDI, code=SCL22, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCL22, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SCL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCL23, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCL23, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SCL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCL24, width=1600, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCL24, width=1600,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SCL24 = "spec:width=1600,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=SCT21, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCT21, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val SCT21 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SCV31, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV31, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SCV31 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=SCV32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SCV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCV33, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV33, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SCV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCV35, width=1440, height=2960, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV35, width=1440,
      height=2960, dpi=420, isGoogleDevice=false).code */
      val SCV35 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV36, width=1440, height=2960, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV36, width=1440,
      height=2960, dpi=480, isGoogleDevice=false).code */
      val SCV36 = "spec:width=1440,height=2960,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCV37, width=1440, height=2960, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV37, width=1440,
      height=2960, dpi=420, isGoogleDevice=false).code */
      val SCV37 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV38, width=1440, height=2960, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV38, width=1440,
      height=2960, dpi=480, isGoogleDevice=false).code */
      val SCV38 = "spec:width=1440,height=2960,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SCV39, width=1440, height=2960, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV39, width=1440,
      height=2960, dpi=420, isGoogleDevice=false).code */
      val SCV39 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV40, width=1440, height=2960, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV40, width=1440,
      height=2960, dpi=420, isGoogleDevice=false).code */
      val SCV40 = "spec:width=1440,height=2960,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV41, width=1440, height=3040, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV41, width=1440,
      height=3040, dpi=420, isGoogleDevice=false).code */
      val SCV41 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV42, width=1440, height=3040, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV42, width=1440,
      height=3040, dpi=420, isGoogleDevice=false).code */
      val SCV42 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV43, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV43, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SCV43 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV43-j, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV43-j, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val SCV43_J = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV44, width=1536, height=2152, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV44, width=1536,
      height=2152, dpi=420, isGoogleDevice=false).code */
      val SCV44 = "spec:width=1536,height=2152,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV45, width=1440, height=3040, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV45, width=1440,
      height=3040, dpi=420, isGoogleDevice=false).code */
      val SCV45 = "spec:width=1440,height=3040,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SCV46, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SCV46, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val SCV46 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SHL21, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHL21, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SHL21 = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SHL22, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHL22, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SHL22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SHL23, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHL23, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHL24, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHL24, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHL24 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHL25, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHL25, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHL25 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHT21, width=800, height=1216, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHT21, width=800,
      height=1216, dpi=213, isGoogleDevice=false).code */
      val SHT21 = "spec:width=800,height=1216,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KDDI, code=SHT22, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHT22, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHT22 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SHV31, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV31, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHV32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHV33, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV33, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHV34, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV34, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SHV34 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SHV35, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV35, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SHV35 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SHV36, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SHV36, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SHV36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SOG01, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG01, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SOG01 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG02, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG02, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOG02 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG03, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG03, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SOG03 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG04, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG04, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOG04 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG05, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG05, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOG05 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG06, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG06, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SOG06 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG07, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG07, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOG07 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG08, width=720, height=1496, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG08, width=720,
      height=1496, dpi=300, isGoogleDevice=false).code */
      val SOG08 = "spec:width=720,height=1496,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KDDI, code=SOG09, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG09, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SOG09 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=KDDI, code=SOG10, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG10, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SOG10 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOG11, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG11, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SOG11 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=KDDI, code=SOG12, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG12, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SOG12 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=KDDI, code=SOG13, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG13, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val SOG13 = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=KDDI, code=SOG14, width=1080, height=2520, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOG14, width=1080,
      height=2520, dpi=450, isGoogleDevice=false).code */
      val SOG14 = "spec:width=1080,height=2520,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=KDDI, code=SOL21, width=720, height=1184, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL21, width=720,
      height=1184, dpi=320, isGoogleDevice=false).code */
      val SOL21 = "spec:width=720,height=1184,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SOL22, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL22, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOL22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOL23, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL23, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOL23 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOL24, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL24, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SOL24 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SOL25, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL25, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOL25 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOL26, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOL26, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOL26 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOT21, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOT21, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val SOT21 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KDDI, code=SOT31, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOT31, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val SOT31 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=SOV31, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV31, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV32, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV32, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV32 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV33, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV33, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV33 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV34, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV34, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV34 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV35, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV35, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV35 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV36, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV36, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SOV36 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV37, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV37, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SOV37 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=SOV38, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV38, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val SOV38 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOV39, width=1440, height=2880, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV39, width=1440,
      height=2880, dpi=560, isGoogleDevice=false).code */
      val SOV39 = "spec:width=1440,height=2880,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=KDDI, code=SOV40, width=1096, height=2560, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV40, width=1096,
      height=2560, dpi=420, isGoogleDevice=false).code */
      val SOV40 = "spec:width=1096,height=2560,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOV41, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV41, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOV41 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOV42, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV42, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOV42 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=SOV43, width=1080, height=2520, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=SOV43, width=1080,
      height=2520, dpi=420, isGoogleDevice=false).code */
      val SOV43 = "spec:width=1080,height=2520,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=sti6030d111, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=sti6030d111, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6030D111 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=TGD, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=TGD, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val TGD = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=KDDI, code=VIF, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=VIF, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val VIF = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KDDI, code=WJG, width=1080, height=2280, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=WJG, width=1080,
      height=2280, dpi=440, isGoogleDevice=false).code */
      val WJG = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=KDDI, code=XIJ, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=XIJ, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val XIJ = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=KDDI, code=XKH, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=XKH, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val XKH = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KDDI, code=XQ-FS, width=1080, height=2340, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=XQ-FS, width=1080,
      height=2340, dpi=400, isGoogleDevice=false).code */
      val XQ_FS = "spec:width=1080,height=2340,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=KDDI, code=YLI, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=YLI, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val YLI = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=KDDI, code=zee, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=zee, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ZEE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KDDI, code=ZKO, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KDDI, code=ZKO, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ZKO = "spec:width=720,height=1520,unit=px,dpi=320"

  }
