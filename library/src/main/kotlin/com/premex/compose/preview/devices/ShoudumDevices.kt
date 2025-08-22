package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Shoudum device specifications for Android Compose previews.
 *
 * This extension provides Shoudum device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Shoudum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Shoudum get() = object {
    /** Shoudum X_50 */
    val X_50 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Shoudum X50 */
    val X50 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Shoudum X_50_EEA */
    val X_50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Shoudum X50US */
    val X50US = "spec:width=800,height=1280,unit=px,dpi=160"

}
