package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eacrugged device specifications for Android Compose previews.
 *
 * This extension provides Eacrugged device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eacrugged.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eacrugged get() = object {
    /** Eacrugged EP500 */
    val EP500 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Eacrugged RG80  */
    val RG80 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Eacrugged Wolf10R */
    val WOLF10R = "spec:width=800,height=1280,unit=px,dpi=240"

}
