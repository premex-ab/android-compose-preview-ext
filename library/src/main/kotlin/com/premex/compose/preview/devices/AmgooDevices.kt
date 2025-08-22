package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Amgoo device specifications for Android Compose previews.
 *
 * This extension provides Amgoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Amgoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Amgoo get() = object {
    /** Amgoo AM515 */
    val AM515 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Amgoo AM530 */
    val AM530 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Amgoo AMGOO */
    val AMGOO = "spec:width=480,height=854,unit=px,dpi=240"

}
