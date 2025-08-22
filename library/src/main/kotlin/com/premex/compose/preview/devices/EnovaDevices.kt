package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Enova device specifications for Android Compose previews.
 *
 * This extension provides Enova device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Enova.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Enova get() = object {
    /** Enova N10 */
    val N10 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Enova N50E */
    val N50E = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Enova N51 */
    val N51 = "spec:width=720,height=1600,unit=px,dpi=480"

    /** Enova TAE08N10 */
    val TAE08N10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
