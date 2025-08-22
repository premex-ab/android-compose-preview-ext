package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mhorse device specifications for Android Compose previews.
 *
 * This extension provides Mhorse device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mhorse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mhorse get() = object {
    /** Mhorse A9 */
    val A9 = "spec:width=800,height=1280,unit=px,dpi=220"

    /** Mhorse C67 */
    val C67 = "spec:width=720,height=1640,unit=px,dpi=320"

    /** Mhorse C68 */
    val C68 = "spec:width=720,height=1640,unit=px,dpi=220"

    /** Mhorse M2S */
    val M2S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Mhorse Pure 3 */
    val PURE_3 = "spec:width=720,height=1440,unit=px,dpi=320"

}
