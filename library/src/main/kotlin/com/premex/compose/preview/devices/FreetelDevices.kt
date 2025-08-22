package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Freetel device specifications for Android Compose previews.
 *
 * This extension provides Freetel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Freetel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Freetel get() = object {
    /** Freetel Cricket Wave */
    val CRICKET_WAVE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Freetel ICE2 */
    val ICE2 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Freetel Priori4 */
    val PRIORI4 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Freetel Priori 5 */
    val PRIORI_5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Freetel RAIJIN */
    val RAIJIN = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Freetel SAKURA_FTE1 */
    val SAKURA_FTE1 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Freetel SAMURAI REI */
    val SAMURAI_REI = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Freetel SAMURAI REI 2 */
    val SAMURAI_REI_2 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
