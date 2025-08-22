package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqandt device specifications for Android Compose previews.
 *
 * This extension provides Iqandt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqandt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqandt get() = object {
    /** Iqandt G3 */
    val G3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Iqandt N3 */
    val N3 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Iqandt N6 */
    val N6 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Iqandt N8 */
    val N8 = "spec:width=1080,height=2280,unit=px,dpi=480"

}
