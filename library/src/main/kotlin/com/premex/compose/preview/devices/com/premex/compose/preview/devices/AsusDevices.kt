package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * asus device specifications for Android Compose previews.
 *
 * This extension provides asus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asus: Any
  get() = object {
      /** DeviceSpec(manufacturer=asus, code=ASUSAI2501, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUSAI2501, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ASUSAI2501 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A001, width=1080, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A001, width=1080,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val ASUS_A001 = "spec:width=1080,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A001D_1, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A001D_1,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val ASUS_A001D_1 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A001D_2, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A001D_2,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val ASUS_A001D_2 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A002, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A002, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val ASUS_A002 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A002_1, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A002_1, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val ASUS_A002_1 = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A006, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A006, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val ASUS_A006 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A007, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A007, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_A007 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_A009, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_A009, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_A009 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS-A86, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS-A86, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_A86 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2201, width=1080, height=2448, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2201, width=1080,
      height=2448, dpi=420, isGoogleDevice=false).code */
      val ASUS_AI2201 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2202, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2202, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ASUS_AI2202 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2203, width=1080, height=2448, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2203, width=1080,
      height=2448, dpi=420, isGoogleDevice=false).code */
      val ASUS_AI2203 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2205, width=1080, height=2448, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2205, width=1080,
      height=2448, dpi=420, isGoogleDevice=false).code */
      val ASUS_AI2205 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2302, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2302, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ASUS_AI2302 = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=asus, code=ASUS_AI2401, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_AI2401, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ASUS_AI2401 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I001_1, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I001_1, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ASUS_I001_1 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I002D, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I002D, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ASUS_I002D = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I003_1, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I003_1, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val ASUS_I003_1 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I004D, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I004D, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val ASUS_I004D = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I005_1, width=1080, height=2448, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I005_1, width=1080,
      height=2448, dpi=420, isGoogleDevice=false).code */
      val ASUS_I005_1 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I006D, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I006D, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val ASUS_I006D = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I007_1, width=1080, height=2448, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I007_1, width=1080,
      height=2448, dpi=420, isGoogleDevice=false).code */
      val ASUS_I007_1 = "spec:width=1080,height=2448,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_I01WD, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_I01WD, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val ASUS_I01WD = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_L001_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_L001_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ASUS_L001_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ASUS_L001_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_L001_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ASUS_L001_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P00I, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P00I, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val ASUS_P00I = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P00J, width=1536, height=2048, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P00J, width=1536,
      height=2048, dpi=360, isGoogleDevice=false).code */
      val ASUS_P00J = "spec:width=1536,height=2048,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P00L_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P00L_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ASUS_P00L_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P00L_2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P00L_2, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ASUS_P00L_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P028_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P028_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ASUS_P028_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ASUS_P028_2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_P028_2, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ASUS_P028_2 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS-T00D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS-T00D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_T00D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00F, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00F, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00F = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00F1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00F1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00F1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00I, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00I, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ASUS_T00I = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00J1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00J1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00J1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00K, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00K, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ASUS_T00K = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00N, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00N, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_T00N = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_T00P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_T00Q, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_T00Q, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_T00Q = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X005, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X005, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_X005 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X007D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X007D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X007D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X008, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X008, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X008 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X008_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X008_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X008_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X009D_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X009D_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_X009D_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00AD_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00AD_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00AD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00BD_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00BD_1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_X00BD_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00DD, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00DD, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00DD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00G_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00G_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00G_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00HD_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00HD_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00HD_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00HD_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00HD_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00HD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00HD_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00HD_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00HD_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00HD_4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00HD_4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00HD_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00ID, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00ID, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00ID = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00IDB, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00IDB, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00IDB = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00IDC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00IDC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00IDC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00LD_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00LD_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00LD_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00LD_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00LD_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00LD_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00LD_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00LD_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00LD_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00P_8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00P_8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00P_8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00QD, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00QD, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00QD = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_6 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00R_7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00R_7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X00R_7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00T_2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00T_2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00T_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00T_3, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00T_3, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00T_3 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00T_4, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00T_4, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00T_4 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00T_6, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00T_6, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00T_6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X00T_8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X00T_8, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X00T_8 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X013D_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X013D_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X013D_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X013D_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X013D_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_X013D_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X014D_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X014D_1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_X014D_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X014D_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X014D_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_X014D_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X017D_1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X017D_1,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X017D_1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X017D_2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X017D_2,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X017D_2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X018_1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X018_1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X018_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X018_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X018_2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ASUS_X018_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X018_4, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X018_4, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ASUS_X018_4 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X01A_1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X01A_1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ASUS_X01A_1 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X01BD_1, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X01BD_1,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val ASUS_X01BD_1 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X01BD_2, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X01BD_2,
      width=1080, height=2280, dpi=480, isGoogleDevice=false).code */
      val ASUS_X01BD_2 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_X550, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_X550, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_X550 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z002, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z002, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z002 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z007, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z007, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_Z007 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00D = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00E_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00E_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00E_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00E_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00E_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00E_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00E_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00E_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00E_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00E_4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00E_4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00E_4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00L_63, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00L_63, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00L_63 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00L_63A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00L_63A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00L_63A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00L_93, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00L_93, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00L_93 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00M, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00M, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00M = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00RD_7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00RD_7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00RD_7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00SD, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00SD, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ASUS_Z00SD = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00T, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00T, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z00T = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00U_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00U_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z00U_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00U_2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00U_2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z00U_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00VD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00VD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00VD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00W_63, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00W_63, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00W_63 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z00YD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z00YD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z00YD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z010, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z010, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z010_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z010_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z010_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z010_CD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z010_CD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ASUS_Z010_CD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z011, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z011, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z011 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z012D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z012D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z012D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z017D_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z017D_1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z017D_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01F_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01F_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01F_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01GD_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01GD_1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01GD_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01H_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01H_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01H_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01KDA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01KDA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01KDA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01KD_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_2,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01KD_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01KD_3,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01KD_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01M_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01M_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ASUS_Z01M_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01QD, width=900, height=1600, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01QD, width=900,
      height=1600, dpi=240, isGoogleDevice=false).code */
      val ASUS_Z01QD = "spec:width=900,height=1600,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01QD_1, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01QD_1,
      width=1080, height=2160, dpi=420, isGoogleDevice=false).code */
      val ASUS_Z01QD_1 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_Z01R_1, width=1080, height=2246, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_Z01R_1, width=1080,
      height=2246, dpi=420, isGoogleDevice=false).code */
      val ASUS_Z01R_1 = "spec:width=1080,height=2246,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=asus, code=ASUS_ZENBO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ASUS_ZENBO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ASUS_ZENBO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K007, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K007, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K007 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=K00C, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00C, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val K00C = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=K00E, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00E, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00E = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K00F, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00F, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K00F = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K00G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K00G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=K00L, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00L, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00L = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K00R, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00R, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K00R = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=K00U, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00U, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00U = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K00X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K00Y, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00Y, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00Y = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K00Z, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K00Z, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K00Z = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K010, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K010E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K010E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K010E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K011, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K011, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K011 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K011_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K011_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K011_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K012, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K012, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K012 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K012_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K012_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K012_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K013, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K013, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K013 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K013C, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K013C, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K013C = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K013_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K013_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K013_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K014, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K014, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K014 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=K015, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K015, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K015 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=K016_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K016_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K016_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K016_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K016_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K016_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K017, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K017, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K017 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K018, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K018, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K018 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K019_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K019_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K019_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K019_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K019_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K019_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K019_3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K019_3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val K019_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=K019_4, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K019_4, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K019_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K01A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K01B, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01B, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val K01B = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=K01E_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01E_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K01E_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K01H, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01H, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K01H = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=K01N_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01N_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01N_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K01N_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01N_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01N_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=K01Q, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01Q, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K01Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=K01U_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=K01U_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K01U_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=me172v, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=me172v, width=600,
      height=976, dpi=160, isGoogleDevice=false).code */
      val ME172V = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ME173X, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ME173X, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ME173X = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=ME301T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ME301T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ME301T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=ME302C, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ME302C, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ME302C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ME302KL, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ME302KL, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ME302KL = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=ME371MG, width=800, height=1216, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=ME371MG, width=800,
      height=1216, dpi=213, isGoogleDevice=false).code */
      val ME371MG = "spec:width=800,height=1216,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P001, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P001, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P001_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P001_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P001_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P002_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P002_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P002_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P002_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P002_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P002_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P002_M, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P002_M, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P002_M = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P008, width=1536, height=2048, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P008, width=1536,
      height=2048, dpi=360, isGoogleDevice=false).code */
      val P008 = "spec:width=1536,height=2048,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=asus, code=P008_1, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P008_1, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P008_1 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P008_2, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P008_2, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P008_2 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P00A_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P00A_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P00A_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P00C_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P00C_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P00C_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P00C_M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P00C_M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P00C_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P00I, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P00I, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P00I = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01M_1, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01M_1, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P01M_1 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01M_2, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01M_2, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P01M_2 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01M_3, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01M_3, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P01M_3 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01M_4, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01M_4, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P01M_4 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01M_5, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01M_5, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P01M_5 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P01T_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01T_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P01T_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P01V_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01V_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P01V_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P01W, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01W, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P01W = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P01Y, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01Y, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P01Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P01Y_2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01Y_2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P01Y_2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P01Y_S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01Y_S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P01Y_S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P01Z, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P01Z, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P01Z = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P021, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P021, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P021 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P021_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P021_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P021_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P022_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P022_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P022_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P022_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P022_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P022_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P023_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P023_1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P023_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P023_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P023_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P023_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=P024_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P024_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P024_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P024_2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P024_2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P024_2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P024_4, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P024_4, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P024_4 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=asus, code=P027, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P027, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val P027 = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=P1801-T, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=P1801-T, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val P1801_T = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=sparrow, width=320, height=320, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=sparrow, width=320,
      height=320, dpi=280, isGoogleDevice=false).code */
      val SPARROW = "spec:width=320,height=320,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=asus, code=swift, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=swift, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val SWIFT = "spec:width=400,height=400,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=asus, code=TF201, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TF201, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TF201 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=TF300T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TF300T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TF300T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=TF300TG, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TF300TG, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TF300TG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=asus, code=TF700T, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TF700T, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TF700T = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=TX201LA, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TX201LA, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TX201LA = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=TX201LAF, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=TX201LAF, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TX201LAF = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=asus, code=wren, width=280, height=280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=wren, width=280,
      height=280, dpi=280, isGoogleDevice=false).code */
      val WREN = "spec:width=280,height=280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=asus, code=Z008_1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z008_1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z008_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=asus, code=Z00A, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00A, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z00A_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00A_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00A_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z00A_3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00A_3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00A_3 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z00X, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00X, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z00X_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00X_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00X_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z00X_2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z00X_2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z00X_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z016, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z016, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z016 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z016_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z016_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z016_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=asus, code=Z01B_1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=asus, code=Z01B_1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z01B_1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
