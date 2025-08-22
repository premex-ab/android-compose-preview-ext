package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobiiot device specifications for Android Compose previews.
 *
 * This extension provides Mobiiot device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobiiot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobiiot get() = object {
    /** Mobiiot MobiGo */
    val MOBIGO = "spec:width=480,height=800,unit=px,dpi=200"

    /** Mobiiot MobiGo 2+ */
    val MOBIGO_2 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Mobiiot Mobigo2 */
    val MOBIGO2 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Mobiiot Mobigo2L */
    val MOBIGO2L = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mobiiot MobiGo 2+ Pro */
    val MOBIGO_2_PRO = "spec:width=480,height=960,unit=px,dpi=213"

    /** Mobiiot MobiPrint4_Plus */
    val MOBIPRINT4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Mobiiot MobiPrint 5 */
    val MOBIPRINT_5 = "spec:width=720,height=1440,unit=px,dpi=300"

    /** Mobiiot WM58 */
    val WM58 = "spec:width=576,height=1152,unit=px,dpi=200"

}
