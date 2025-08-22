package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * A1 device specifications for Android Compose previews.
 *
 * This extension provides A1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.A1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.A1 get() = object {
    /** A1 A1 Alpha 20+ */
    val A1_ALPHA_20 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** A1 A1 Smart N9 */
    val A1_SMART_N9 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** A1 Ai-ES1059 */
    val AI_ES1059 = "spec:width=800,height=1280,unit=px,dpi=160"

}
