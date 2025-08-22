package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STYLO device specifications for Android Compose previews.
 *
 * This extension provides STYLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STYLO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STYLO: Any
  get() = object {
      /** DeviceSpec(manufacturer=STYLO, code=AIR, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=AIR, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val AIR = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=APEX_5G, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=APEX_5G, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val APEX_5G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=ARCTIC, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=ARCTIC, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val ARCTIC = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=STYLO, code=AS210291, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=AS210291, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val AS210291 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=STYLO, code=AURORA, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=AURORA, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val AURORA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=AW230345, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=AW230345, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AW230345 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=BOLD, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=BOLD, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BOLD = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=BOLD_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=BOLD_PLUS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BOLD_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=BRAVE, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=BRAVE, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val BRAVE = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=Comet, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Comet, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val COMET = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=CPE91, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=CPE91, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CPE91 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=DQR22, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=DQR22, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val DQR22 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=STYLO, code=DVK82_Mercury, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=DVK82_Mercury,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val DVK82_MERCURY = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=DVK83, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=DVK83, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DVK83 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=DVK87_Orion_8_Tab, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=DVK87_Orion_8_Tab,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val DVK87_ORION_8_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=DVK88, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=DVK88, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val DVK88 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=Energy, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Energy, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ENERGY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=Galaxy, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Galaxy, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val GALAXY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=INKOSI, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=INKOSI, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val INKOSI = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=INKOSI_PRO, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=INKOSI_PRO, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val INKOSI_PRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=INKOSI_PRO_4G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=INKOSI_PRO_4G,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val INKOSI_PRO_4G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=INKULU_PRO, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=INKULU_PRO, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val INKULU_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=STYLO, code=Ithemba, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Ithemba, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val ITHEMBA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=LIFE_2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=LIFE_2, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LIFE_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=MARVEL, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=MARVEL, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MARVEL = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=MATRIX, width=540, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=MATRIX, width=540,
      height=960, dpi=220, isGoogleDevice=false).code */
      val MATRIX = "spec:width=540,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=STYLO, code=MAVERICK, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=MAVERICK, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val MAVERICK = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=MIRAGE, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=MIRAGE, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val MIRAGE = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=MOSCOW, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=MOSCOW, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MOSCOW = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=ORION_TAB_10_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=ORION_TAB_10_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ORION_TAB_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=Orion_Tab_8_4G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Orion_Tab_8_4G,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val ORION_TAB_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=Phoenix, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Phoenix, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val PHOENIX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=RAIN, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=RAIN, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val RAIN = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=STYLO, code=S40_LIFE, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S40_LIFE, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S40_LIFE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S40_Vida, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S40_Vida, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S40_VIDA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S40_Vino, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S40_Vino, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S40_VINO = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S40_VISTA, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S40_VISTA, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S40_VISTA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S49_ECO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S49_ECO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S49_ECO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S49_MONO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S49_MONO, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S49_MONO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S55_Nova, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S55_Nova, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S55_NOVA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=S56_MIST, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S56_MIST, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S56_MIST = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=S64_ALPHA, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S64_ALPHA, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S64_ALPHA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=S9_TOPAZ, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=S9_TOPAZ, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S9_TOPAZ = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=SATURN, width=480, height=1014, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=SATURN, width=480,
      height=1014, dpi=180, isGoogleDevice=false).code */
      val SATURN = "spec:width=480,height=1014,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=STYLO, code=SIRIUS_TAB_8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=SIRIUS_TAB_8,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SIRIUS_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=STYLO, code=SOLAR, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=SOLAR, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val SOLAR = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=SONIC, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=SONIC, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val SONIC = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=STEP_UP, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=STEP_UP, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val STEP_UP = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=STYLO_S50_Granite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=STYLO_S50_Granite,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val STYLO_S50_GRANITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=Stylo_Viva, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=Stylo_Viva, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val STYLO_VIVA = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=SWIFT_4G, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=SWIFT_4G, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val SWIFT_4G = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=STYLO, code=TITAN, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=TITAN, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val TITAN = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=STYLO, code=UNIVERSE, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=UNIVERSE, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val UNIVERSE = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=V, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=V, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=VERTIGO, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=VERTIGO, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val VERTIGO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=STYLO, code=VS571, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=VS571, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val VS571 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=X5, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=X5, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val X5 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=X7, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=X7, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val X7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=STYLO, code=10_Notebook, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=10_Notebook, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val _10_NOTEBOOK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=STYLO, code=221, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=221, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val _221 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=STYLO, code=721, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=721, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val _721 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=STYLO, code=721_PRO, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLO, code=721_PRO, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val _721_PRO = "spec:width=480,height=800,unit=px,dpi=200"

  }
