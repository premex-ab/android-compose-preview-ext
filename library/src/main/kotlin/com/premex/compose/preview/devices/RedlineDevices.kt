package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Redline device specifications for Android Compose previews.
 *
 * This extension provides Redline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Redline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Redline get() = object {
    /** Redline Space_A10 */
    val SPACE_A10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Redline Space_A18 */
    val SPACE_A18 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Redline Space_M10 */
    val SPACE_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Redline Space_M10Pro */
    val SPACE_M10PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

}
