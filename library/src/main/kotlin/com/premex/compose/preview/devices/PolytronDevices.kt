package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Polytron device specifications for Android Compose previews.
 *
 * This extension provides Polytron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Polytron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Polytron get() = object {
    /** Polytron P500 */
    val P500 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polytron P551S */
    val P551S = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Polytron POLYTRON P552 */
    val POLYTRON_P552 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Polytron POLYTRON R2509 */
    val POLYTRON_R2509 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polytron POLYTRON R2509SE */
    val POLYTRON_R2509SE = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polytron POLYTRON R250A */
    val POLYTRON_R250A = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Polytron PRIME A8 */
    val PRIME_A8 = "spec:width=720,height=1280,unit=px,dpi=320"

}
