package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Toshiba device specifications for Android Compose previews.
 *
 * This extension provides Toshiba device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Toshiba.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Toshiba get() = object {
    /** Toshiba A204 */
    val A204 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Toshiba A205 */
    val A205 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Toshiba AT10-A/AT15-A (Japan: AT503) */
    val AT10_A_AT15_A_JAPAN_AT503 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Toshiba AT10LE-A/AT15LE-A/AT10PE-A/AT15PE-A  (Japan: AT703) */
    val AT10LE_A_AT15LE_A_AT10PE_A_AT15PE_A_JAPAN_AT703 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Toshiba AT400 */
    val AT400 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Toshiba AT7-A */
    val AT7_A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Toshiba AT7-B */
    val AT7_B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Toshiba JPN:REGZA Tablet AT500  Other countries:TOSHIBA AT300 */
    val JPN_REGZA_TABLET_AT500_OTHER_COUNTRIES_TOSHIBA_AT300 = "spec:width=752,height=1280,unit=px,dpi=160"

    /** Toshiba JP:REGZA Tablet AT570  Others:TOSHIBA AT270 */
    val JP_REGZA_TABLET_AT570_OTHERS_TOSHIBA_AT270 = "spec:width=736,height=1280,unit=px,dpi=213"

    /** Toshiba TD-E657TS */
    val TD_E657TS = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Toshiba TD-E757TS */
    val TD_E757TS = "spec:width=2160,height=3840,unit=px,dpi=480"

}
