package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vetoo device specifications for Android Compose previews.
 *
 * This extension provides Vetoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vetoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vetoo get() = object {
    /** Vetoo T4GB07 */
    val T4GB07 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vetoo T4GB10 */
    val T4GB10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Vetoo TWIFIB07 */
    val TWIFIB07 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vetoo V10 */
    val V10 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
