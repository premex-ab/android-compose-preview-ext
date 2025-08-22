package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

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
      /** DeviceSpec(manufacturer=Bmobile, code=AX1073PLUSMV18, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=AX1073PLUSMV18,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val AX1073PLUSMV18 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=B55, width=442, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=B55, width=442,
      height=960, dpi=213, isGoogleDevice=false).code */
      val B55 = "spec:width=442,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Bmobile, code=B60Pro_MV03, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=B60Pro_MV03,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val B60PRO_MV03 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1016, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1016,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1016 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1017_MV12, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1017_MV12,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1017_MV12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1017_TG05, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1017_TG05,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1017_TG05 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1035, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1035,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1035 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1065E, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1065E,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1065E = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1070, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1070,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1070 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1073 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073Plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073Plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1073PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073PLUSW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1073PLUSW,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1073PLUSW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1074, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1074,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1074 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1075, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1075,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_AX1075 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1076P_MV03, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1076P_MV03, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1076P_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1076P_MV05, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1076P_MV05, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1076P_MV05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1076P_MV12, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1076P_MV12, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1076P_MV12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1077 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077_MAS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077_MAS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1077_MAS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077_MTG05, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1077_MTG05, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1077_MTG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077_MTG06, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1077_MTG06, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1077_MTG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1077_MTG07, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1077_MTG07, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1077_MTG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_OM, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_OM,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1078_OM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG05, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG05,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1078_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG06, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG06,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1078_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG07, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG07,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1078_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1078_TG07B, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX1078_TG07B, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1078_TG07B = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1082, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1082,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1082 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1082_MV15, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX1082_MV15,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX1082_MV15 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX680_, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX680_,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX680 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX681, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX681,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX681 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX683, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX683,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX683 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX685, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX685,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX685 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX687, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX687,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX687 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX687_MV03, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX687_MV03,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX687_MV03 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX688, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX688,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX688 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX715, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX715,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX715 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX751, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX751,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX751 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX751_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX751_PLUS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX751_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX754, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX754,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX754 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX754PLUS, width=540, height=960, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX754PLUS,
      width=540, height=960, dpi=260, isGoogleDevice=false).code */
      val BMOBILE_AX754PLUS = "spec:width=540,height=960,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX820, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX820,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX820 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX821, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX821,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX821 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX823, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX823,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX823 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824A,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX824A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824PLUS_MV03, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX824PLUS_MV03, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX824PLUS_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824Plus_MV15, width=480, height=854,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_AX824Plus_MV15, width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX824PLUS_MV15 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824_MV03, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX824_MV03,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX824_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX825, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX825,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX825 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX830, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX830,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX830 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX905, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX905,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX905 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX920, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX920,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_AX920 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX921, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX921,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_AX921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX951, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX951,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX951 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX960_MV03, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX960_MV03,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX960_MV03 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX960_MV15, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_AX960_MV15,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_AX960_MV15 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_B50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50Pro, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50Pro,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_B50PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50ProSS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50ProSS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_B50PROSS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50Pro_MV03, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50Pro_MV03,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_B50PRO_MV03 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B50_1,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_B50_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B60Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B60Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_B60PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B60Pro_MV03SP, width=720, height=1560,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_B60Pro_MV03SP, width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_B60PRO_MV03SP = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B70Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_B70Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_B70PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_B70Pro_MV03, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_B70Pro_MV03, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_B70PRO_MV03 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL40_MV12, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL40_MV12,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL40_MV12 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG05, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG05,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50P_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG06, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG06,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50P_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG07, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50P_TG07,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50P_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG06, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG06,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG07, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG07,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG09, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL50_TG09,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL50_TG09 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL51_MV05, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL51_MV05,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL51_MV05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL52, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL52,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL52 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL52Pro, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL52Pro,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val BMOBILE_BL52PRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG05, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG05,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL53_TG05 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG06, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG06,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL53_TG06 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG07, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL53_TG07,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL53_TG07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL54Pro, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL54Pro,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL54PRO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL54_PRO_TG05, width=480, height=960,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_BL54_PRO_TG05, width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL54_PRO_TG05 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL55,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL55_TG06, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL55_TG06,
      width=480, height=960, dpi=220, isGoogleDevice=false).code */
      val BMOBILE_BL55_TG06 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60M_MV05, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60M_MV05,
      width=600, height=1280, dpi=280, isGoogleDevice=false).code */
      val BMOBILE_BL60M_MV05 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60_TG05, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60_TG05,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL60_TG05 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60_TG17, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL60_TG17,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL60_TG17 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL61_MV05, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL61_MV05,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL61_MV05 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL62, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL62,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL62 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL62i, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL62i,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val BMOBILE_BL62I = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL63, width=480, height=1016, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL63,
      width=480, height=1016, dpi=200, isGoogleDevice=false).code */
      val BMOBILE_BL63 = "spec:width=480,height=1016,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL63Pro, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL63Pro,
      width=480, height=1014, dpi=200, isGoogleDevice=false).code */
      val BMOBILE_BL63PRO = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL65Plus_TG07, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_BL65Plus_TG07, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL65PLUS_TG07 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL65_OM, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL65_OM,
      width=540, height=1200, dpi=240, isGoogleDevice=false).code */
      val BMOBILE_BL65_OM = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL65_TG, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BL65_TG,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BL65_TG = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BM65Plus, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BM65Plus,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BM65PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BM65Pro_TG05, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_BM65Pro_TG05, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BM65PRO_TG05 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_BM65_PRO, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_BM65_PRO,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_BM65_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_COSMO_B6_TG, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_COSMO_B6_TG,
      width=480, height=960, dpi=213, isGoogleDevice=false).code */
      val BMOBILE_COSMO_B6_TG = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_NOVUS65_TG06, width=576, height=1280,
      dpi=260, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_NOVUS65_TG06, width=576, height=1280, dpi=260, isGoogleDevice=false).code */
      val BMOBILE_NOVUS65_TG06 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_NOVUS65_TG07, width=576, height=1280,
      dpi=260, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_NOVUS65_TG07, width=576, height=1280, dpi=260, isGoogleDevice=false).code */
      val BMOBILE_NOVUS65_TG07 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_Novus_65, width=576, height=1280, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_Novus_65,
      width=576, height=1280, dpi=260, isGoogleDevice=false).code */
      val BMOBILE_NOVUS_65 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_Novus_65_MV03, width=576, height=1280,
      dpi=260, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_Novus_65_MV03, width=576, height=1280, dpi=260, isGoogleDevice=false).code */
      val BMOBILE_NOVUS_65_MV03 = "spec:width=576,height=1280,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_T70, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_T70,
      width=600, height=1024, dpi=213, isGoogleDevice=false).code */
      val BMOBILE_T70 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_ULTRA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=Bmobile_ULTRA,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=Bmobile_ULTRA_S_MV03, width=720, height=1612,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile,
      code=Bmobile_ULTRA_S_MV03, width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val BMOBILE_ULTRA_S_MV03 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Bmobile, code=ULTRA_S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bmobile, code=ULTRA_S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ULTRA_S = "spec:width=720,height=1612,unit=px,dpi=320"

  }
