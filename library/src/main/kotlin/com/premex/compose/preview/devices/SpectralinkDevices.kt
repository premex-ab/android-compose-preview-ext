package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spectralink device specifications for Android Compose previews.
 *
 * This extension provides Spectralink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spectralink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spectralink get() = object {
    /** Spectralink Versity 92-Series  */
    val VERSITY_92_SERIES = "spec:width=480,height=800,unit=px,dpi=240"

    /** Spectralink Versity 9740 */
    val VERSITY_9740 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
