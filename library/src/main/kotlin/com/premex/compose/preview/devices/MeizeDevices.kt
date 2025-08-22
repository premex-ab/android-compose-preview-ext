package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Meize device specifications for Android Compose previews.
 *
 * This extension provides Meize device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Meize.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Meize get() = object {
    /** Meize D105 */
    val D105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meize D106 */
    val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Meize D115 */
    val D115 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meize D125_EEA */
    val D125_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meize D126 */
    val D126 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Meize  D126_EEA  */
    val D126_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
