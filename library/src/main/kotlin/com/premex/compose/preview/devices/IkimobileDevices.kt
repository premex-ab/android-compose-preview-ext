package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ikimobile device specifications for Android Compose previews.
 *
 * This extension provides Ikimobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ikimobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ikimobile get() = object {
    /** Ikimobile BLESSPLUS */
    val BLESSPLUS = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Ikimobile GO5_55 */
    val GO5_55 = "spec:width=720,height=1280,unit=px,dpi=320"

}
