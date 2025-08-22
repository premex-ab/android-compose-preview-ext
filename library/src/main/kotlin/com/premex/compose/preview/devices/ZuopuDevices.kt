package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zuopu device specifications for Android Compose previews.
 *
 * This extension provides Zuopu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zuopu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zuopu get() = object {
    /** Zuopu JH101 */
    val JH101 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zuopu JH103 */
    val JH103 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zuopu 	JH105 */
    val JH105 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zuopu JH863 */
    val JH863 = "spec:width=800,height=1280,unit=px,dpi=213"

}
