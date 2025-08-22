package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Goldtech device specifications for Android Compose previews.
 *
 * This extension provides Goldtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Goldtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Goldtech get() = object {
    /** Goldtech GT10-B16 */
    val GT10_B16 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goldtech GT7-B16 */
    val GT7_B16 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Goldtech JTTAB035 */
    val JTTAB035 = "spec:width=600,height=1024,unit=px,dpi=160"

}
