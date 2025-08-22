package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Olike device specifications for Android Compose previews.
 *
 * This extension provides Olike device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Olike.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Olike get() = object {
    /** Olike E1 */
    val E1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Olike E3 */
    val E3 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
