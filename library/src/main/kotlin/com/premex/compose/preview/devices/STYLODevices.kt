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
      /** STYLO AIR */
      val AIR = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO APEX_5G */
      val APEX_5G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STYLO ARCTIC */
      val ARCTIC = "spec:width=720,height=1560,unit=px,dpi=300"

      /** STYLO AS210291 */
      val AS210291 = "spec:width=480,height=960,unit=px,dpi=220"

      /** STYLO AURORA */
      val AURORA = "spec:width=480,height=1014,unit=px,dpi=213"

      /** STYLO AW230345 */
      val AW230345 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STYLO BOLD */
      val BOLD = "spec:width=480,height=854,unit=px,dpi=240"

      /** STYLO BOLD_PLUS */
      val BOLD_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** STYLO BRAVE */
      val BRAVE = "spec:width=480,height=854,unit=px,dpi=213"

      /** STYLO Comet */
      val COMET = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO CPE91 */
      val CPE91 = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO DQR22 */
      val DQR22 = "spec:width=480,height=960,unit=px,dpi=220"

      /** STYLO DVK82_Mercury */
      val DVK82_MERCURY = "spec:width=720,height=1560,unit=px,dpi=320"

      /** STYLO DVK83 */
      val DVK83 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STYLO DVK87_Orion_8_Tab */
      val DVK87_ORION_8_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** STYLO DVK88 */
      val DVK88 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** STYLO Energy */
      val ENERGY = "spec:width=720,height=1440,unit=px,dpi=320"

      /** STYLO Galaxy */
      val GALAXY = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STYLO INKOSI */
      val INKOSI = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO INKOSI_PRO */
      val INKOSI_PRO = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO INKOSI_PRO_4G */
      val INKOSI_PRO_4G = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO INKULU_PRO */
      val INKULU_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** STYLO Ithemba */
      val ITHEMBA = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO LIFE_2 */
      val LIFE_2 = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO MARVEL */
      val MARVEL = "spec:width=480,height=854,unit=px,dpi=213"

      /** STYLO MATRIX */
      val MATRIX = "spec:width=540,height=960,unit=px,dpi=220"

      /** STYLO MAVERICK */
      val MAVERICK = "spec:width=720,height=1640,unit=px,dpi=320"

      /** STYLO MIRAGE */
      val MIRAGE = "spec:width=480,height=854,unit=px,dpi=213"

      /** STYLO MOSCOW */
      val MOSCOW = "spec:width=480,height=854,unit=px,dpi=240"

      /** STYLO ORION_TAB_10_4G */
      val ORION_TAB_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** STYLO Orion_Tab_8_4G */
      val ORION_TAB_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

      /** STYLO Phoenix */
      val PHOENIX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** STYLO RAIN */
      val RAIN = "spec:width=480,height=854,unit=px,dpi=180"

      /** STYLO S40_LIFE */
      val S40_LIFE = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO S40_Vida */
      val S40_VIDA = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO S40_Vino */
      val S40_VINO = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO S40_VISTA */
      val S40_VISTA = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO S49_ECO */
      val S49_ECO = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO S49_MONO */
      val S49_MONO = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO S55_Nova */
      val S55_NOVA = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO S56_MIST */
      val S56_MIST = "spec:width=720,height=1520,unit=px,dpi=320"

      /** STYLO S64_ALPHA */
      val S64_ALPHA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** STYLO S9_TOPAZ */
      val S9_TOPAZ = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO SATURN */
      val SATURN = "spec:width=480,height=1014,unit=px,dpi=180"

      /** STYLO SIRIUS_TAB_8 */
      val SIRIUS_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** STYLO SOLAR */
      val SOLAR = "spec:width=720,height=1612,unit=px,dpi=320"

      /** STYLO SONIC */
      val SONIC = "spec:width=480,height=1014,unit=px,dpi=200"

      /** STYLO STEP_UP */
      val STEP_UP = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO STYLO_S50_Granite */
      val STYLO_S50_GRANITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** STYLO Stylo_Viva */
      val STYLO_VIVA = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO SWIFT_4G */
      val SWIFT_4G = "spec:width=480,height=854,unit=px,dpi=220"

      /** STYLO TITAN */
      val TITAN = "spec:width=720,height=1600,unit=px,dpi=300"

      /** STYLO UNIVERSE */
      val UNIVERSE = "spec:width=720,height=1640,unit=px,dpi=320"

      /** STYLO V */
      val V = "spec:width=540,height=960,unit=px,dpi=240"

      /** STYLO VERTIGO */
      val VERTIGO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** STYLO VS571 */
      val VS571 = "spec:width=480,height=960,unit=px,dpi=240"

      /** STYLO X5 */
      val X5 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** STYLO X7 */
      val X7 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** STYLO 10_Notebook */
      val _10_NOTEBOOK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** STYLO 221 */
      val _221 = "spec:width=480,height=960,unit=px,dpi=200"

      /** STYLO 721 */
      val _721 = "spec:width=480,height=800,unit=px,dpi=240"

      /** STYLO 721_PRO */
      val _721_PRO = "spec:width=480,height=800,unit=px,dpi=200"

  }
