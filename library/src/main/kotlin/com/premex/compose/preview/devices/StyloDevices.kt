package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stylo device specifications for Android Compose previews.
 *
 * This extension provides Stylo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stylo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stylo get() = object {
    /** Stylo 10_Notebook */
    val _10_NOTEBOOK = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Stylo 221 */
    val _221 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo 721 */
    val _721 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo 721_PRO */
    val _721_PRO = "spec:width=480,height=800,unit=px,dpi=200"

    /** Stylo AIR */
    val AIR = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo APEX_5G */
    val APEX_5G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stylo ARCTIC */
    val ARCTIC = "spec:width=720,height=1560,unit=px,dpi=300"

    /** Stylo AS210291 */
    val AS210291 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Stylo ATLAS */
    val ATLAS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stylo AURORA */
    val AURORA = "spec:width=480,height=1014,unit=px,dpi=213"

    /** Stylo BOLD */
    val BOLD = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stylo BOLD_PLUS */
    val BOLD_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stylo BRAVE */
    val BRAVE = "spec:width=480,height=854,unit=px,dpi=213"

    /** Stylo Comet */
    val COMET = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo DVK82 Mercury */
    val DVK82_MERCURY = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Stylo DVK87_Orion 8_Tab */
    val DVK87_ORION_8_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Stylo Galaxy */
    val GALAXY = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stylo INKOSI */
    val INKOSI = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo INKOSI-PRO */
    val INKOSI_PRO = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo INKOSI_PRO_4G */
    val INKOSI_PRO_4G = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo INKULU_PRO */
    val INKULU_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Stylo Ithemba */
    val ITHEMBA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo Jupiter */
    val JUPITER = "spec:width=480,height=960,unit=px,dpi=220"

    /** Stylo LIFE_2 */
    val LIFE_2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo MARVEL */
    val MARVEL = "spec:width=480,height=854,unit=px,dpi=213"

    /** Stylo MATRIX */
    val MATRIX = "spec:width=540,height=960,unit=px,dpi=220"

    /** Stylo MAVERICK */
    val MAVERICK = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Stylo MIRAGE */
    val MIRAGE = "spec:width=480,height=854,unit=px,dpi=213"

    /** Stylo MOSCOW */
    val MOSCOW = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stylo ORION PLUS TAB 10 */
    val ORION_PLUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Stylo ORION_TAB_10_4G */
    val ORION_TAB_10_4G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Stylo Orion_Tab_8_4G */
    val ORION_TAB_8_4G = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Stylo Phoenix */
    val PHOENIX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stylo Quantum */
    val QUANTUM = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Stylo RAIN */
    val RAIN = "spec:width=480,height=854,unit=px,dpi=180"

    /** Stylo S40_LIFE */
    val S40_LIFE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo S40 Vino */
    val S40_VINO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo S40_VISTA */
    val S40_VISTA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo S49 ECO */
    val S49_ECO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo S49 MONO */
    val S49_MONO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo S50 */
    val S50 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stylo S501 */
    val S501 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stylo S54 Zen */
    val S54_ZEN = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo S55 Nova */
    val S55_NOVA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo S56 Mist */
    val S56_MIST = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Stylo S64 ALPHA */
    val S64_ALPHA = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Stylo S9 TOPAZ */
    val S9_TOPAZ = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo SATURN */
    val SATURN = "spec:width=480,height=1014,unit=px,dpi=180"

    /** Stylo Sirius_Plus_Tab_10 */
    val SIRIUS_PLUS_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Stylo SIRIUS_TAB_8 */
    val SIRIUS_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Stylo SOLAR */
    val SOLAR = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Stylo SONIC */
    val SONIC = "spec:width=480,height=1014,unit=px,dpi=200"

    /** Stylo STEP_UP */
    val STEP_UP = "spec:width=480,height=960,unit=px,dpi=200"

    /** Stylo Stylo_521 */
    val STYLO_521 = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Stylo Stylo S40 */
    val STYLO_S40 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo Stylo_Viva */
    val STYLO_VIVA = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stylo SWIFT_4G */
    val SWIFT_4G = "spec:width=480,height=854,unit=px,dpi=220"

    /** Stylo TAB4 */
    val TAB4 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Stylo TITAN */
    val TITAN = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Stylo UNIVERSE  */
    val UNIVERSE = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Stylo V */
    val V = "spec:width=540,height=960,unit=px,dpi=240"

    /** Stylo VERTIGO */
    val VERTIGO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Stylo VS571 */
    val VS571 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Stylo X5 */
    val X5 = "spec:width=540,height=1200,unit=px,dpi=240"

    /** Stylo X7 */
    val X7 = "spec:width=720,height=1640,unit=px,dpi=320"

}
