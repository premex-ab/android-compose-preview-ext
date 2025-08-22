package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Qlink device specifications for Android Compose previews.
 *
 * This extension provides Qlink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Qlink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Qlink get() = object {
    /** Qlink Scepter_8 */
    val SCEPTER_8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Qlink scepter8 */
    val SCEPTER8 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Qlink Scepter 8 Tablet */
    val SCEPTER_8_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

}
