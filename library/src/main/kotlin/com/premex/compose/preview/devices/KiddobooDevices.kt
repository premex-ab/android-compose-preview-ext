package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kiddoboo device specifications for Android Compose previews.
 *
 * This extension provides Kiddoboo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kiddoboo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kiddoboo get() = object {
    /** Kiddoboo KB101 */
    val KB101 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Kiddoboo KB101B */
    val KB101B = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Kiddoboo KB102 */
    val KB102 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Kiddoboo Kiddoboo Plus KB80P */
    val KIDDOBOO_PLUS_KB80P = "spec:width=800,height=1280,unit=px,dpi=200"

}
