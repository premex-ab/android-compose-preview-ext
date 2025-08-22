package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coopers device specifications for Android Compose previews.
 *
 * This extension provides Coopers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coopers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coopers get() = object {
    /** Coopers CP10 */
    val CP10 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Coopers CP20 */
    val CP20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Coopers CP70K */
    val CP70K = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Coopers CP80 */
    val CP80 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Coopers CP81 */
    val CP81 = "spec:width=800,height=1280,unit=px,dpi=180"

}
