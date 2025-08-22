package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Rizzen device specifications for Android Compose previews.
 *
 * This extension provides Rizzen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Rizzen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Rizzen get() = object {
    /** Rizzen Novatab */
    val NOVATAB = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Rizzen NovaTab_R10 */
    val NOVATAB_R10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rizzen NovaTab_R10s */
    val NOVATAB_R10S = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Rizzen S1 */
    val S1 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Rizzen X1 */
    val X1 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Rizzen X1x */
    val X1X = "spec:width=1200,height=2000,unit=px,dpi=280"

}
