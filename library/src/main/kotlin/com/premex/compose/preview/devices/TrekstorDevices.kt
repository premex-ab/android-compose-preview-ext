package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trekstor device specifications for Android Compose previews.
 *
 * This extension provides Trekstor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trekstor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trekstor get() = object {
    /** Trekstor SurfTab breeze 9.6 quad  */
    val SURFTAB_BREEZE_9_6_QUAD = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Trekstor TFMTKAW01232 */
    val TFMTKAW01232 = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Trekstor THMTKAW03232_eea */
    val THMTKAW03232_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Trekstor THMTKAW04232_eea */
    val THMTKAW04232_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Trekstor tolino tab 7 */
    val TOLINO_TAB_7 = "spec:width=900,height=1440,unit=px,dpi=240"

    /** Trekstor tolino tab 8 */
    val TOLINO_TAB_8 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Trekstor tolino tab 8.9 */
    val TOLINO_TAB_8_9 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Trekstor Trekstor Surftab B10 */
    val TREKSTOR_SURFTAB_B10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Trekstor Trekstor Surftab theatre K13 */
    val TREKSTOR_SURFTAB_THEATRE_K13 = "spec:width=1080,height=1920,unit=px,dpi=213"

    /** Trekstor Trekstor Surftab theatre S11 */
    val TREKSTOR_SURFTAB_THEATRE_S11 = "spec:width=1080,height=1920,unit=px,dpi=213"

}
