package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZUUM device specifications for Android Compose previews.
 *
 * This extension provides ZUUM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZUUM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZUUM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZUUM, code=AKUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AKUS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AKUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=AKUS_P1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AKUS_P1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AKUS_P1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=AKUS_PRO, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AKUS_PRO, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val AKUS_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ZUUM, code=AKUS_TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AKUS_TAB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AKUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUUM, code=Akus_Z, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Akus_Z, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AKUS_Z = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=AKUS_Z1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AKUS_Z1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AKUS_Z1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=Aura_M1, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Aura_M1, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val AURA_M1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_M2, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_M2, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val AURA_M2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_PLUS_JLO, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_PLUS_JLO,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val AURA_PLUS_JLO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AURA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_PRO_JLO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_PRO_JLO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AURA_PRO_JLO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_X, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_X, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val AURA_X = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=AURA_Z, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=AURA_Z, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AURA_Z = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=Aura_Z1, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Aura_Z1, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val AURA_Z1 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ZUUM, code=COVET, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=COVET, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COVET = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=COVET_PRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=COVET_PRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val COVET_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=COVET_PRO_LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=COVET_PRO_LITE,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val COVET_PRO_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=COVET_X, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=COVET_X, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val COVET_X = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZUUM, code=COVET_Z, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=COVET_Z, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val COVET_Z = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=GRANT, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=GRANT, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRANT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=Gravity, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Gravity, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GRAVITY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=GRAVITY_M, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=GRAVITY_M, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val GRAVITY_M = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=GRAVITY_Z, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=GRAVITY_Z, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GRAVITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=Hidra_Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Hidra_Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HIDRA_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_C, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_C, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MAGNO_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_C1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_C1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MAGNO_C1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_C2, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_C2, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val MAGNO_C2 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=ZUUM, code=Magno_C_Plus, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Magno_C_Plus, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val MAGNO_C_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_MINI, width=360, height=640, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_MINI, width=360,
      height=640, dpi=240, isGoogleDevice=false).code */
      val MAGNO_MINI = "spec:width=360,height=640,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_P1, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_P1, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val MAGNO_P1 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_P4, width=576, height=1152, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_P4, width=576,
      height=1152, dpi=220, isGoogleDevice=false).code */
      val MAGNO_P4 = "spec:width=576,height=1152,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_PLUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MAGNO_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=Magno_Pro, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Magno_Pro, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val MAGNO_PRO = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ZUUM, code=MAGNO_S, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=MAGNO_S, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val MAGNO_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=NOVUS_TAB, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=NOVUS_TAB, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOVUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZUUM, code=ONIX, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ONIX, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ONIX = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=ONIX_S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ONIX_S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ONIX_S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=ROCKET_II, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ROCKET_II, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ROCKET_II = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZUUM, code=ROCKET_III, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ROCKET_III, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val ROCKET_III = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=ZUUM, code=SENS_CURVE, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=SENS_CURVE, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val SENS_CURVE = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=SENS_G, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=SENS_G, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val SENS_G = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STELLAR_M1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M2, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val STELLAR_M2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_M3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_M4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M5, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M5, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val STELLAR_M5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_M6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_M6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_M6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=Stellar_Max, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=Stellar_Max, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_MINI, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_MINI, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STELLAR_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_P3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_P3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val STELLAR_P3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_P4, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_P4, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_P4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_P5, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_P5, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val STELLAR_P5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_P6, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_P6, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val STELLAR_P6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_P8, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_P8, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val STELLAR_P8 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_PLUS, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_PLUS, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val STELLAR_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=STELLAR_Z, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=STELLAR_Z, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STELLAR_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZUUM, code=VOLTA_KIDS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=VOLTA_KIDS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VOLTA_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZUUM, code=ZUUM_PAD_Kids, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ZUUM_PAD_Kids,
      width=600, height=1024, dpi=200, isGoogleDevice=false).code */
      val ZUUM_PAD_KIDS = "spec:width=600,height=1024,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=ZUUM, code=ZUUM_PAD_Lightyear, width=600, height=1024, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZUUM, code=ZUUM_PAD_Lightyear,
      width=600, height=1024, dpi=200, isGoogleDevice=false).code */
      val ZUUM_PAD_LIGHTYEAR = "spec:width=600,height=1024,unit=px,dpi=200"

  }
