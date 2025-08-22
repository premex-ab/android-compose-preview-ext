package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Holo device specifications for Android Compose previews.
 *
 * This extension provides Holo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Holo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Holo get() = object {
    /** Holo USA */
    val USA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Holo VE0319 */
    val VE0319 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Holo X10 */
    val X10 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Holo XPLAY3 */
    val XPLAY3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Holo XULTRA2 */
    val XULTRA2 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Holo XULTRA3 */
    val XULTRA3 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Holo XULTRAPLUS */
    val XULTRAPLUS = "spec:width=1200,height=2000,unit=px,dpi=213"

    /** Holo XULTRAPLUS3 */
    val XULTRAPLUS3 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
