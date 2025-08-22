package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Everis device specifications for Android Compose previews.
 *
 * This extension provides Everis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Everis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Everis get() = object {
    /** Everis E0109 */
    val E0109 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everis E0111 */
    val E0111 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Everis E0112 */
    val E0112 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everis E0113 */
    val E0113 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Everis E0114 */
    val E0114 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Everis E0117 */
    val E0117 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Everis E0118 */
    val E0118 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Everis E0120 */
    val E0120 = "spec:width=800,height=1280,unit=px,dpi=160"

}
