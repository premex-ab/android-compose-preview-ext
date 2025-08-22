package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Helio device specifications for Android Compose previews.
 *
 * This extension provides Helio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Helio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Helio get() = object {
    /** Helio helio 40 */
    val HELIO_40 = "spec:width=720,height=1604,unit=px,dpi=280"

    /** Helio helio 50 */
    val HELIO_50 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Helio Helio S5 */
    val HELIO_S5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Helio S10 */
    val S10 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Helio S2 */
    val S2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Helio S25 */
    val S25 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
