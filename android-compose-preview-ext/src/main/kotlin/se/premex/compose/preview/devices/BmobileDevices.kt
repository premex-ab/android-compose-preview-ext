package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bmobile device specifications for Android Compose previews.
 *
 * This extension provides Bmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bmobile: Any
  get() = object {
      /** Bmobile AX1073PLUSMV18 */
      val AX1073PLUSMV18 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile B55 */
      val B55 = "spec:width=442,height=960,unit=px,dpi=213"

      /** Bmobile B60Pro_MV03 */
      val B60PRO_MV03 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_AX1016 */
      val BMOBILE_AX1016 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1017_MV12 */
      val BMOBILE_AX1017_MV12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1017_TG05 */
      val BMOBILE_AX1017_TG05 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1035 */
      val BMOBILE_AX1035 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1065E */
      val BMOBILE_AX1065E = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1070 */
      val BMOBILE_AX1070 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1073 */
      val BMOBILE_AX1073 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1073Plus */
      val BMOBILE_AX1073PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1073PLUSW */
      val BMOBILE_AX1073PLUSW = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1074 */
      val BMOBILE_AX1074 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1075 */
      val BMOBILE_AX1075 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bmobile Bmobile_AX1076P_MV03 */
      val BMOBILE_AX1076P_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1076P_MV05 */
      val BMOBILE_AX1076P_MV05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1076P_MV12 */
      val BMOBILE_AX1076P_MV12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1077 */
      val BMOBILE_AX1077 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1077_MAS */
      val BMOBILE_AX1077_MAS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1077_MTG05 */
      val BMOBILE_AX1077_MTG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1077_MTG06 */
      val BMOBILE_AX1077_MTG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1077_MTG07 */
      val BMOBILE_AX1077_MTG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1078_OM */
      val BMOBILE_AX1078_OM = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1078_TG05 */
      val BMOBILE_AX1078_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1078_TG06 */
      val BMOBILE_AX1078_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1078_TG07 */
      val BMOBILE_AX1078_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1078_TG07B */
      val BMOBILE_AX1078_TG07B = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1082 */
      val BMOBILE_AX1082 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX1082_MV15 */
      val BMOBILE_AX1082_MV15 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX680_ */
      val BMOBILE_AX680 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX681 */
      val BMOBILE_AX681 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX683 */
      val BMOBILE_AX683 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX685 */
      val BMOBILE_AX685 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX687 */
      val BMOBILE_AX687 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX687_MV03 */
      val BMOBILE_AX687_MV03 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX688 */
      val BMOBILE_AX688 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_AX715 */
      val BMOBILE_AX715 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX751 */
      val BMOBILE_AX751 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX751_PLUS */
      val BMOBILE_AX751_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX754 */
      val BMOBILE_AX754 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX754PLUS */
      val BMOBILE_AX754PLUS = "spec:width=540,height=960,unit=px,dpi=260"

      /** Bmobile Bmobile_AX820 */
      val BMOBILE_AX820 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX821 */
      val BMOBILE_AX821 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX823 */
      val BMOBILE_AX823 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX824A */
      val BMOBILE_AX824A = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX824PLUS_MV03 */
      val BMOBILE_AX824PLUS_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX824Plus_MV15 */
      val BMOBILE_AX824PLUS_MV15 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX824_MV03 */
      val BMOBILE_AX824_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX825 */
      val BMOBILE_AX825 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_AX830 */
      val BMOBILE_AX830 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX905 */
      val BMOBILE_AX905 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX920 */
      val BMOBILE_AX920 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bmobile Bmobile_AX921 */
      val BMOBILE_AX921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Bmobile Bmobile_AX951 */
      val BMOBILE_AX951 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX960_MV03 */
      val BMOBILE_AX960_MV03 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_AX960_MV15 */
      val BMOBILE_AX960_MV15 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_B50 */
      val BMOBILE_B50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_B50Pro */
      val BMOBILE_B50PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_B50ProSS */
      val BMOBILE_B50PROSS = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_B50Pro_MV03 */
      val BMOBILE_B50PRO_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_B50_1 */
      val BMOBILE_B50_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_B60Pro */
      val BMOBILE_B60PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_B60Pro_MV03SP */
      val BMOBILE_B60PRO_MV03SP = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_B70Pro */
      val BMOBILE_B70PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Bmobile Bmobile_B70Pro_MV03 */
      val BMOBILE_B70PRO_MV03 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Bmobile Bmobile_BL40_MV12 */
      val BMOBILE_BL40_MV12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50 */
      val BMOBILE_BL50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50P_TG05 */
      val BMOBILE_BL50P_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50P_TG06 */
      val BMOBILE_BL50P_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50P_TG07 */
      val BMOBILE_BL50P_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50_TG06 */
      val BMOBILE_BL50_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50_TG07 */
      val BMOBILE_BL50_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL50_TG09 */
      val BMOBILE_BL50_TG09 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL51_MV05 */
      val BMOBILE_BL51_MV05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL52 */
      val BMOBILE_BL52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL52Pro */
      val BMOBILE_BL52PRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** Bmobile Bmobile_BL53_TG05 */
      val BMOBILE_BL53_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL53_TG06 */
      val BMOBILE_BL53_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL53_TG07 */
      val BMOBILE_BL53_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Bmobile Bmobile_BL54Pro */
      val BMOBILE_BL54PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_BL54_PRO_TG05 */
      val BMOBILE_BL54_PRO_TG05 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_BL55 */
      val BMOBILE_BL55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Bmobile Bmobile_BL55_TG06 */
      val BMOBILE_BL55_TG06 = "spec:width=480,height=960,unit=px,dpi=220"

      /** Bmobile Bmobile_BL60M_MV05 */
      val BMOBILE_BL60M_MV05 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** Bmobile Bmobile_BL60_TG05 */
      val BMOBILE_BL60_TG05 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_BL60_TG17 */
      val BMOBILE_BL60_TG17 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_BL61_MV05 */
      val BMOBILE_BL61_MV05 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_BL62 */
      val BMOBILE_BL62 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Bmobile Bmobile_BL62i */
      val BMOBILE_BL62I = "spec:width=480,height=960,unit=px,dpi=200"

      /** Bmobile Bmobile_BL63 */
      val BMOBILE_BL63 = "spec:width=480,height=1016,unit=px,dpi=200"

      /** Bmobile Bmobile_BL63Pro */
      val BMOBILE_BL63PRO = "spec:width=480,height=1014,unit=px,dpi=200"

      /** Bmobile Bmobile_BL65Plus_TG07 */
      val BMOBILE_BL65PLUS_TG07 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Bmobile Bmobile_BL65_OM */
      val BMOBILE_BL65_OM = "spec:width=540,height=1200,unit=px,dpi=240"

      /** Bmobile Bmobile_BL65_TG */
      val BMOBILE_BL65_TG = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Bmobile Bmobile_BM65Plus */
      val BMOBILE_BM65PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Bmobile Bmobile_BM65Pro_TG05 */
      val BMOBILE_BM65PRO_TG05 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Bmobile Bmobile_BM65_PRO */
      val BMOBILE_BM65_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Bmobile Bmobile_COSMO_B6_TG */
      val BMOBILE_COSMO_B6_TG = "spec:width=480,height=960,unit=px,dpi=213"

      /** Bmobile Bmobile_NOVUS65_TG06 */
      val BMOBILE_NOVUS65_TG06 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** Bmobile Bmobile_NOVUS65_TG07 */
      val BMOBILE_NOVUS65_TG07 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** Bmobile Bmobile_Novus_65 */
      val BMOBILE_NOVUS_65 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** Bmobile Bmobile_Novus_65_MV03 */
      val BMOBILE_NOVUS_65_MV03 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** Bmobile Bmobile_T70 */
      val BMOBILE_T70 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Bmobile Bmobile_ULTRA */
      val BMOBILE_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Bmobile Bmobile_ULTRA_S_MV03 */
      val BMOBILE_ULTRA_S_MV03 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Bmobile ULTRA_S */
      val ULTRA_S = "spec:width=720,height=1612,unit=px,dpi=320"

  }
