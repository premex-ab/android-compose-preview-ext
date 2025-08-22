package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avvio device specifications for Android Compose previews.
 *
 * This extension provides Avvio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avvio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avvio get() = object {
    /** Avvio Avvio 4GO */
    val AVVIO_4GO = "spec:width=480,height=800,unit=px,dpi=240"

    /** Avvio Avvio A400 */
    val AVVIO_A400 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Avvio Q503 */
    val Q503 = "spec:width=720,height=1280,unit=px,dpi=320"

}
