package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zatec device specifications for Android Compose previews.
 *
 * This extension provides Zatec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zatec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zatec get() = object {
    /** Zatec JOY */
    val JOY = "spec:width=480,height=996,unit=px,dpi=240"

    /** Zatec JOY_PLUS */
    val JOY_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

    /** Zatec WIND */
    val WIND = "spec:width=480,height=960,unit=px,dpi=240"

    /** Zatec ZPAD_1 */
    val ZPAD_1 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Zatec Zpower_2018 */
    val ZPOWER_2018 = "spec:width=480,height=960,unit=px,dpi=240"

}
