package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Isafemobile device specifications for Android Compose previews.
 *
 * This extension provides Isafemobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Isafemobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Isafemobile get() = object {
    /** Isafemobile IS330 */
    val IS330 = "spec:width=320,height=432,unit=px,dpi=160"

    /** Isafemobile IS530 */
    val IS530 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Isafemobile IS540 */
    val IS540 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Isafemobile IS930 */
    val IS930 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
