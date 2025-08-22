package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chainway device specifications for Android Compose previews.
 *
 * This extension provides Chainway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chainway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chainway get() = object {
    /** Chainway C6000 */
    val C6000 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Chainway C61 */
    val C61 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Chainway C66 */
    val C66 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Chainway C71_EEA */
    val C71_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Chainway C72_EEA */
    val C72_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Chainway C90 */
    val C90 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Chainway MC50 */
    val MC50 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Chainway MC62 */
    val MC62 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Chainway MC95 */
    val MC95 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Chainway P80 */
    val P80 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Chainway P80_B */
    val P80_B = "spec:width=1200,height=1920,unit=px,dpi=360"

}
