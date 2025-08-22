package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLU device specifications for Android Compose previews.
 *
 * This extension provides BLU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLU: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLU, code=A0050LL, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A0050LL, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A0050LL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A230Q, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A230Q, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A230Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A290Q, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A290Q, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A290Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=A30, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A30, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A350, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A350, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A350 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A350A, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A350A, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A350A = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A390, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A390, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A390 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=A390T, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=A390T, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A390T = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Advance_4_0_L3, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Advance_4_0_L3,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ADVANCE_4_0_L3 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Advance_5_0_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Advance_5_0_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ADVANCE_5_0_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=B100DL, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B100DL, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val B100DL = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLU, code=B110DL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B110DL, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val B110DL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=B130DL, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B130DL, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val B130DL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=B140DL, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B140DL, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val B140DL = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLU, code=B160V, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B160V, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val B160V = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLU, code=B170D, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B170D, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val B170D = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLU, code=B301, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=B301, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val B301 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_ADVANCE_4_0_L2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_ADVANCE_4_0_L2,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BLU_ADVANCE_4_0_L2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_DASH_L2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_DASH_L2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BLU_DASH_L2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_DASH_M2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_DASH_M2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_DASH_M2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_DASH_X, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_DASH_X, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_DASH_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_DASH_X2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_DASH_X2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_DASH_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_DIAMOND_M, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_DIAMOND_M, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_DIAMOND_M = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_DIAMOND, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_DIAMOND,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_ENERGY_DIAMOND = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_XL, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_XL,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BLU_ENERGY_XL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Energy_X_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Energy_X_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_ENERGY_X_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_X_PLUS_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_ENERGY_X_PLUS_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_ENERGY_X_PLUS_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_GRAND_5_5_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_GRAND_5_5_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_GRAND_5_5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Grand_X_LTE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Grand_X_LTE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_GRAND_X_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_LIFE_XL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_LIFE_XL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_LIFE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_PURE_XL, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_PURE_XL, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val BLU_PURE_XL = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Pure_XR, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Pure_XR, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BLU_PURE_XR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=BLU_R1_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_R1_HD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_R1_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_C_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_C_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_STUDIO_C_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_ENERGY_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_ENERGY_2,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_STUDIO_ENERGY_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_STUDIO_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_G2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_G2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_STUDIO_G2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_M_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_M_HD,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_STUDIO_M_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_ONE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_ONE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_STUDIO_ONE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_SELFIE_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_STUDIO_SELFIE_2,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val BLU_STUDIO_SELFIE_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Studio_Touch, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Studio_Touch,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_STUDIO_TOUCH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_VIVO_5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_VIVO_5, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_VIVO_5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Vivo_5R, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Vivo_5R, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BLU_VIVO_5R = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Vivo_6, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Vivo_6, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BLU_VIVO_6 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=BLU_VIVO_XL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_VIVO_XL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_VIVO_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=BLU_Vivo_XL2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=BLU_Vivo_XL2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLU_VIVO_XL2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C0010LL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0010LL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0010LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0010TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0010TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0010TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0010UU, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0010UU, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0010UU = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0030, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0030, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C0030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C0040TT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0040TT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C0040TT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C0050, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0050, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0050 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0051LL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0051LL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0051LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0070WW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0070WW, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0070WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0090WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0090WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C0090WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C0100TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0100TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0100TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0101TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0101TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0101TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0101WW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0101WW, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C0101WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C010Q, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C010Q, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C010Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0130UU, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0130UU, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0130UU = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C014, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C014, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C014 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0140TT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0140TT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0140TT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0141TT, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0141TT, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0141TT = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0150WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0150WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0150WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0151WW, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0151WW, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val C0151WW = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=C0161WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0161WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0161WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0162WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0162WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0162WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0170WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0170WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0170WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0173WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0173WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C0173WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0175, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0175, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val C0175 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=C0176, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0176, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0176 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C017U, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C017U, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C017U = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C0190, width=540, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0190, width=540,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0190 = "spec:width=540,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C0200, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0200, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0200 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C0210, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0210, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0210 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C0220, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0220, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val C0220 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=C0230, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0230, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val C0230 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C0270, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C0270, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val C0270 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=C031P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C031P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C031P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C050, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C050, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val C050 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C090EQ, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C090EQ, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C090EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C090P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C090P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C090P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C110, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C110, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val C110 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=C111, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C111, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C111 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C130EQ, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C130EQ, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C130EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C210, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C210, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C210 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C230EQ, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C230EQ, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C230EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C250EQ, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C250EQ, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C250EQ = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C270EQ, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C270EQ, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val C270EQ = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=C290EQ, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=C290EQ, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val C290EQ = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=D0070WW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=D0070WW, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val D0070WW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=D10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=D10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val D10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=D600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=D600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val D600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=D701, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=D701, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val D701 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Dash_G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Dash_G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DASH_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Dash_X2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Dash_X2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DASH_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=Dash_XL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Dash_XL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DASH_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=E0010, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=E0010, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val E0010 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=E20, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=E20, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val E20 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=ENERGY_DIAMOND_MINI, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=ENERGY_DIAMOND_MINI,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ENERGY_DIAMOND_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=F0030UU, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=F0030UU, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val F0030UU = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=F0090, width=720, height=1612, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=F0090, width=720,
      height=1612, dpi=300, isGoogleDevice=false).code */
      val F0090 = "spec:width=720,height=1612,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=BLU, code=G0030, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0030, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G0030 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0050, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0050, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G0050 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G0070WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0070WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G0070WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G0090, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0090, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0090 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0130WW, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0130WW, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G0130WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0130WW_SR, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0130WW_SR, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G0130WW_SR = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0151WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0151WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0151WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0170, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0170, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G0170 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0190, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0190, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0190 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0210, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0210, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0210 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0230WW, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0230WW, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val G0230WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0231WW, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0231WW, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val G0231WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0250WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0250WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0250WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0251WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0251WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0251WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0270WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0270WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0270WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0290WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0290WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0290WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0310WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0310WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0310WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0330WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0330WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0330WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0350WW, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0350WW, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G0350WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0370WW, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0370WW, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val G0370WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0390WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0390WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0390WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0410WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0410WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0410WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0430WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0430WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0430WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0450WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0450WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0450WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0490WW, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0490WW, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val G0490WW = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=BLU, code=G0510WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0510WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0510WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0512WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0512WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0512WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0530WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0530WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G0530WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0550WW, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0550WW, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G0550WW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0570WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0570WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0570WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0581WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0581WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0581WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0590WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0590WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0590WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0591WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0591WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G0591WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0630WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0630WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G0630WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0670WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0670WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G0670WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0690WW, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0690WW, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G0690WW = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0710WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0710WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0710WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0730WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0730WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0730WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0770, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0770, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0770 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0771, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0771, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0771 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0790UU, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0790UU, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G0790UU = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0820WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0820WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0820WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0830WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0830WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0830WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0840, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0840, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0840 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0850, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0850, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0850 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0850_IW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0850_IW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0850_IW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0850_TIGO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0850_TIGO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0850_TIGO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0851, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0851, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0851 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0860, width=720, height=1640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0860, width=720,
      height=1640, dpi=240, isGoogleDevice=false).code */
      val G0860 = "spec:width=720,height=1640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G0870, width=720, height=1640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0870, width=720,
      height=1640, dpi=240, isGoogleDevice=false).code */
      val G0870 = "spec:width=720,height=1640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G0890, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0890, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val G0890 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=G0892, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0892, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val G0892 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=G0894, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0894, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val G0894 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=G0910, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0910, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G0910 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G0930, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0930, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0930 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0950, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0950, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val G0950 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G0970, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0970, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val G0970 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=BLU, code=G0971, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0971, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val G0971 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=BLU, code=G0990, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G0990, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G0990 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G1010, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G1010, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val G1010 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLU, code=G1030, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G1030, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G1030 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G1050, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G1050, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G1050 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=G1070, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G1070, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val G1070 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=BLU, code=G1110, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G1110, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G1110 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=G170Q, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G170Q, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G170Q = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G190, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G190, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G190 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=G210Q, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=G210Q, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G210Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Grand_Energy, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Grand_Energy, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAND_ENERGY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Grand_M, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Grand_M, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GRAND_M = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Grand_Max, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Grand_Max, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAND_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Grand_X, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Grand_X, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAND_X = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Grand_XL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Grand_XL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAND_XL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=J0000LL_ATT_MX, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0000LL_ATT_MX,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val J0000LL_ATT_MX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=J0080WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0080WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val J0080WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=J0082WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0082WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val J0082WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=J0090WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0090WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val J0090WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=J0092WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0092WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val J0092WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=J0100, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0100, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val J0100 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=J0110, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0110, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val J0110 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=J0140, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0140, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val J0140 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=J0150, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0150, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val J0150 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=J0170, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0170, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val J0170 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLU, code=J0230, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J0230, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val J0230 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=J210EQ, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=J210EQ, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val J210EQ = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=K0010, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K0010, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K0010 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=K0110, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K0110, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val K0110 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=K0130, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K0130, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val K0130 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=K0150, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K0150, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val K0150 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=K0170, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K0170, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val K0170 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=K10, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K10, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val K10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=K101, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K101, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val K101 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=K10_PRO, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=K10_PRO, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val K10_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=L0150WW, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=L0150WW, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L0150WW = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=Life_Max, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Life_Max, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LIFE_MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Life_One_X2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Life_One_X2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LIFE_ONE_X2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=Life_One_X2_Mini, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Life_One_X2_Mini,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val LIFE_ONE_X2_MINI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=M0030TT, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0030TT, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M0030TT = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=M0050LL, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0050LL, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val M0050LL = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLU, code=M0080WW, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0080WW, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M0080WW = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=M0100WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0100WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M0100WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=M0160WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0160WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val M0160WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=M0170WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0170WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0170WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0171WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0171WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0171WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0172WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0172WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0172WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0173WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0173WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0173WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0174WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0174WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0174WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0174WW_ND, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0174WW_ND, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0174WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0176, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0176, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0176 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0176_EX, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0176_EX, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0176_EX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0176_ND, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0176_ND, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0176_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0178_ND, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0178_ND, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val M0178_ND = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=M0208WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0208WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0208WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0209WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0209WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0209WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0210WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0210WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0210WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0212WW_ND, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0212WW_ND, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0212WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0213_ND, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0213_ND, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0213_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0214_ND, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0214_ND, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val M0214_ND = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=M0215, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0215, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val M0215 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=M0215_ND, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0215_ND, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val M0215_ND = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=M0220WW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0220WW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0220WW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0220WW_ND, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0220WW_ND, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0220WW_ND = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0222, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0222, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0222 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0222_EX, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0222_EX, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0222_EX = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0222_IMT, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0222_IMT, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val M0222_IMT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=M0223_ND, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0223_ND, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M0223_ND = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BLU, code=M0224, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M0224, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val M0224 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=M030P, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=M030P, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val M030P = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=N0030WW, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=N0030WW, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val N0030WW = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=N0050UU, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=N0050UU, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val N0050UU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=N0070, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=N0070, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val N0070 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=P0050WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=P0050WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P0050WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=P290, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=P290, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P290 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BLU, code=R010P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R010P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R010P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=R0150EE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R0150EE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R0150EE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=R0170WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R0170WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R0170WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=R0190WW, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R0190WW, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val R0190WW = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=R1_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R1_HD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R1_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=R1_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=R1_PLUS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S011EQ, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S011EQ, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S011EQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=S0320WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0320WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S0320WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S0450WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0450WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S0450WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S0480LL, width=720, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0480LL, width=720,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val S0480LL = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=BLU, code=S050EQ, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S050EQ, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S050EQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=S0570WW, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0570WW, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val S0570WW = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BLU, code=S0590LL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0590LL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S0590LL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=S0610WW, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0610WW, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val S0610WW = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=S0630WW, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0630WW, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val S0630WW = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=BLU, code=S0690WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0690WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S0690WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S0730WW, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S0730WW, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val S0730WW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S532, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S532, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S532 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S750, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S750, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S750 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S770P, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S770P, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S770P = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=S790Q, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S790Q, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S790Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S810, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S810, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S810 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S812P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S812P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S812P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S870Q, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S870Q, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S870Q = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S910Q, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S910Q, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S910Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S950P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S950P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S950P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=S970EQ, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S970EQ, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S970EQ = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=S990EQ, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=S990EQ, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S990EQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Studio_G2_HD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_G2_HD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_G2_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Studio_G_HD_LTE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_G_HD_LTE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_G_HD_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Studio_J1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_J1, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val STUDIO_J1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Studio_J2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_J2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STUDIO_J2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Studio_J5, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_J5, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val STUDIO_J5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=Studio_J8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_J8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_J8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Studio_J8_LTE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_J8_LTE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_J8_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Studio_Mega, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_Mega, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_MEGA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Studio_XL_2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Studio_XL_2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STUDIO_XL_2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=T0030WW, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0030WW, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val T0030WW = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0040TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0040TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0040TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0050TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0050TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0050TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0060TT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0060TT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T0060TT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=T0070TT_TIGO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0070TT_TIGO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T0070TT_TIGO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=T0080TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0080TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0080TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0090TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0090TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0090TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0120TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0120TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0120TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=T0130TT, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=T0130TT, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T0130TT = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=Tank_Xtreme_5_0, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Tank_Xtreme_5_0,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TANK_XTREME_5_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0150LL, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0150LL, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V0150LL = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=V0150UU, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0150UU, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V0150UU = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=V0160WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0160WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V0160WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0190UU, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0190UU, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V0190UU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0210WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0210WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V0210WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0230WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0230WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V0230WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0250WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0250WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V0250WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0270WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0270WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V0270WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0290WW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0290WW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V0290WW = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0310WW, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0310WW, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val V0310WW = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLU, code=V0330WW, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0330WW, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V0330WW = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0350WW, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0350WW, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val V0350WW = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0370WW, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0370WW, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val V0370WW = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=V0390WW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=V0390WW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V0390WW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=Vivo_5_Mini, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=Vivo_5_Mini, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VIVO_5_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BLU, code=X0010WW, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=X0010WW, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X0010WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BLU, code=X0020, width=540, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLU, code=X0020, width=540,
      height=960, dpi=200, isGoogleDevice=false).code */
      val X0020 = "spec:width=540,height=960,unit=px,dpi=200"

  }
