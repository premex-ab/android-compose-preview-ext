package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Freeyond device specifications for Android Compose previews.
 *
 * This extension provides Freeyond device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Freeyond.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Freeyond get() = object {
    /** Freeyond F9 */
    val F9 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Freeyond F9S */
    val F9S = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Freeyond FreeYondA5 */
    val FREEYONDA5 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Freeyond FreeYondP6 */
    val FREEYONDP6 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Freeyond M5 */
    val M5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Freeyond M5A */
    val M5A = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Freeyond M6 */
    val M6 = "spec:width=1080,height=2460,unit=px,dpi=480"

}
