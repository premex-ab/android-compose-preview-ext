package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Viwa device specifications for Android Compose previews.
 *
 * This extension provides Viwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Viwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Viwa get() = object {
    /** Viwa LIGHT ONE */
    val LIGHT_ONE = "spec:width=480,height=854,unit=px,dpi=240"

    /** Viwa LIGHT PLUS */
    val LIGHT_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Viwa VIWA_V10 */
    val VIWA_V10 = "spec:width=600,height=1024,unit=px,dpi=160"

}
