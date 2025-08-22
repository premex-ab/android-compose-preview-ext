package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mobicel device specifications for Android Compose previews.
 *
 * This extension provides Mobicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobicel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Mobicel, code=ASTRO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=ASTRO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ASTRO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BEAM, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BEAM, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BEAM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BERRY, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BERRY, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BERRY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BERRY1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BERRY1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BERRY1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BERRY_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BERRY_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BERRY_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BERRY_PLUS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BERRY_PLUS,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val BERRY_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=BERRY_PRO, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BERRY_PRO, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val BERRY_PRO = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=BLINK, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=BLINK, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BLINK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Candy, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Candy, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CANDY = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Chrome_LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Chrome_LTE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val CHROME_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=CLIK, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=CLIK, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CLIK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Clik_plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Clik_plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CLIK_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Cosmo_LTE, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Cosmo_LTE, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val COSMO_LTE = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=DANDY, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=DANDY, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DANDY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=DANDY_ZAM, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=DANDY_ZAM, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val DANDY_ZAM = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=EGO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EGO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val EGO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=EPIC_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EPIC_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val EPIC_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=EPIC_2, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EPIC_2, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val EPIC_2 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=EPIC_MAX, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EPIC_MAX, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val EPIC_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=EPIC_PRO_1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EPIC_PRO_1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val EPIC_PRO_1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=EPIC_PRO_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=EPIC_PRO_2,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val EPIC_PRO_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=F40, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=F40, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val F40 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=F41, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=F41, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val F41 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=F50, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=F50, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val F50 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=F51, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=F51, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val F51 = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=Mobicel, code=FAME, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FAME, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val FAME = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=FAME_DS, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FAME_DS, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val FAME_DS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=FENDY_DS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FENDY_DS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val FENDY_DS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Fendy_plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Fendy_plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val FENDY_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=FEVER_PLUS_H, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FEVER_PLUS_H,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val FEVER_PLUS_H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=Fever_Plus_J, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Fever_Plus_J,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val FEVER_PLUS_J = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=FORCE, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FORCE, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val FORCE = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=FRIO, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=FRIO, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FRIO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=GEO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=GEO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GEO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=GLO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=GLO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val GLO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=HERO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=HERO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val HERO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=HERO_DS, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=HERO_DS, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val HERO_DS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=HYPE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=HYPE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HYPE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=IX, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=IX, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val IX = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=IX-1, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=IX-1, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val IX_1 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=IX_PLUS, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=IX_PLUS, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val IX_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=IX_PRO, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=IX_PRO, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val IX_PRO = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Mobicel, code=Legend, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Legend, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val LEGEND = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=LEGEND_MAX, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=LEGEND_MAX,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val LEGEND_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Legend_Max_2, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Legend_Max_2,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val LEGEND_MAX_2 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=LEGEND_PRO_1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=LEGEND_PRO_1,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LEGEND_PRO_1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Legend_Pro_LTE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Legend_Pro_LTE,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LEGEND_PRO_LTE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Mercury, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Mercury, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MERCURY = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Mobicel_Icon, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Mobicel_Icon,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MOBICEL_ICON = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Mobicel_R1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Mobicel_R1,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val MOBICEL_R1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Mobicel_R6, width=540, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Mobicel_R6,
      width=540, height=960, dpi=213, isGoogleDevice=false).code */
      val MOBICEL_R6 = "spec:width=540,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=MX2_PLUS, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=MX2_PLUS, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MX2_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=MX3_PLUS, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=MX3_PLUS, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MX3_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=NEO_1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=NEO_1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NEO_1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Neo_LTE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Neo_LTE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NEO_LTE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Neo_Plus, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Neo_Plus, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val NEO_PLUS = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=OREO, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=OREO, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val OREO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=P11, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=P11, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val P11 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=P11_Plus, width=576, height=1152, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=P11_Plus, width=576,
      height=1152, dpi=220, isGoogleDevice=false).code */
      val P11_PLUS = "spec:width=576,height=1152,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Mobicel, code=P12, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=P12, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P12 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=P5, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=P5, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val P5 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Mobicel, code=PULSE_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=PULSE_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PULSE_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=PURE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=PURE, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PURE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=PURE_MINI, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=PURE_MINI, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PURE_MINI = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=PURE_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=PURE_PLUS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PURE_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=PX12, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=PX12, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val PX12 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=Q10, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Q10, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val Q10 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=R1PLUS_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R1PLUS_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R1PLUS_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R1_Plus, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R1_Plus, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R1_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R4, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R4, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R4 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=R4_LTE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R4_LTE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R4_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R6_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R6_PLUS, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R6_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=R7, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R7, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R7 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R7_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R7_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R7_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R7_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R7_2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R7_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=R8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=R9_LITE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R9_LITE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R9_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=R9_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=R9_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val R9_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=REBEL, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=REBEL, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val REBEL = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=RIO_BN, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RIO_BN, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RIO_BN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=RIO_RW, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RIO_RW, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RIO_RW = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=RIO_SS, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RIO_SS, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RIO_SS = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=RIO_ZAM, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RIO_ZAM, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val RIO_ZAM = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=RUBY, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RUBY, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RUBY = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=RUSH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RUSH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RUSH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=RX, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RX, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=RX17, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RX17, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val RX17 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=RX_Plus, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RX_Plus, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val RX_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=RX_PRO, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=RX_PRO, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val RX_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Smart_Tab_10, width=800, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Smart_Tab_10,
      width=800, height=1280, dpi=280, isGoogleDevice=false).code */
      val SMART_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Mobicel, code=Smart_Tab_8, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Smart_Tab_8,
      width=800, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=SWITCH, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=SWITCH, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SWITCH = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=SWITCH1, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=SWITCH1, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SWITCH1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Switch_GO, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Switch_GO, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SWITCH_GO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=switch_plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=switch_plus,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SWITCH_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=TANGO_LITE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=TANGO_LITE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TANGO_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=TITAN, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=TITAN, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TITAN = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=Titan_1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Titan_1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TITAN_1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=TRENDY_2, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=TRENDY_2, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TRENDY_2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=TRENDY_LITE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=TRENDY_LITE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TRENDY_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=TRENDY_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=TRENDY_PLUS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val TRENDY_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=U2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=U2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val U2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=ULTRA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=ULTRA, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ULTRA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=V1, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=V1, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=V2_LTE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=V2_LTE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V2_LTE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=V4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=V4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=VEGA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VEGA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VEGA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=VENUS_G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VENUS_G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VENUS_G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=VIBE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VIBE, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val VIBE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=VX18, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VX18, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val VX18 = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=Mobicel, code=VX19, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VX19, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VX19 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=VX20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VX20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VX20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=VX20_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VX20_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VX20_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=VX21, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=VX21, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val VX21 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=X1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=X1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=X4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=X4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Mobicel, code=X6, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=X6, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val X6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=X7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=X7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X7 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=X9, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=X9, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X9 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Mobicel, code=Z4, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=Z4, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val Z4 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Mobicel, code=ZOOM, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=ZOOM, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ZOOM = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=ZOOM_1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=ZOOM_1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ZOOM_1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=ZOOM_H, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=ZOOM_H, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ZOOM_H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Mobicel, code=4U, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Mobicel, code=4U, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val _4U = "spec:width=480,height=854,unit=px,dpi=240"

  }
