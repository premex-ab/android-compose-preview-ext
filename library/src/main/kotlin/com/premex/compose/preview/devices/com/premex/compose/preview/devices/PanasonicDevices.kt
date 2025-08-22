package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Panasonic device specifications for Android Compose previews.
 *
 * This extension provides Panasonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Panasonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Panasonic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Panasonic, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=anaheim,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=DMC-CM1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=DMC-CM1,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val DMC_CM1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_A2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_A2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_A2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_A3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_A3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_A3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_A4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_A4,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_A4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_Arc_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_Arc_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_ARC_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_F, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_F, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_F = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_I2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_I2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_I3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_I3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_I3_Mega, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_I3_Mega,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I3_MEGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_I6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_I6,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val ELUGA_I6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_I7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_I7,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_I7_EE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_I7_EE,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I7_EE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_I8, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_I8,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val ELUGA_I8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_Mark_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_Mark_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_MARK_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Note, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Note,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ELUGA_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Prim, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Prim,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_PRIM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Pulse_X, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Pulse_X,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_PULSE_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_500,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_530, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_530,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_530 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_550, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_550,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_550 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_600,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_610, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_610,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_610 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_700, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_700,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ELUGA_RAY_700 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_800, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_800,
      width=1080, height=1920, dpi=420, isGoogleDevice=false).code */
      val ELUGA_RAY_800 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_810, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Eluga_Ray_810,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_810 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_Max,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ELUGA_RAY_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_X, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Ray_X,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_RAY_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Turbo, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Turbo,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_TURBO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_U3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_U3,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val ELUGA_U3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_WE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_WE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ELUGA_WE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_X1, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_X1,
      width=1080, height=2246, dpi=480, isGoogleDevice=false).code */
      val ELUGA_X1 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Y, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Y, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val ELUGA_Y = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Y_Pro, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Y_Pro,
      width=720, height=1512, dpi=320, isGoogleDevice=false).code */
      val ELUGA_Y_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=ELUGA_Z1, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=ELUGA_Z1,
      width=720, height=1500, dpi=320, isGoogleDevice=false).code */
      val ELUGA_Z1 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Jupiter, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Jupiter,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val JUPITER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=kadoma, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=kadoma, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KADOMA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=OD0M_EA_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=OD0M_EA_T32,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P101, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P101, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P101 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=P55_Novo_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P55_Novo_4G,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val P55_NOVO_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P6, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P6, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=P71, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P71, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P71 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P77, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P77, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P85, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P85, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P85 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P85Nxt, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P85Nxt, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P85NXT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=P91, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=P91, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P91 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=Panasonic_ELUGA_C, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic,
      code=Panasonic_ELUGA_C, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PANASONIC_ELUGA_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=Panasonic_P90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Panasonic_P90,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PANASONIC_P90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=shandao, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=shandao,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SHANDAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=shibuya, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=shibuya, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Panasonic, code=SPU-A06L-LWG, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SPU-A06L-LWG,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SPU_A06L_LWG = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=SW3H_ATV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SW3H_ATV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SW3H_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=SW3_ATV, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SW3_ATV,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SW3_ATV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SW4H_FF,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Panasonic, code=T44, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=T44, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val T44 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Panasonic, code=Tab_8, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=Tab_8, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TAB_8 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Panasonic, code=TAB-A05, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=TAB-A05, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Panasonic, code=TAB-A05-BA1, width=1440, height=2960, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Panasonic, code=TAB-A05-BA1,
      width=1440, height=2960, dpi=440, isGoogleDevice=false).code */
      val TAB_A05_BA1 = "spec:width=1440,height=2960,unit=px,dpi=440"

  }
