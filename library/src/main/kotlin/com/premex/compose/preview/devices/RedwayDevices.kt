package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Redway device specifications for Android Compose previews.
 *
 * This extension provides Redway device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Redway.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Redway get() = object {
    /** Redway redway10 */
    val REDWAY10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Redway redway10_lite */
    val REDWAY10_LITE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Redway redway7_pro */
    val REDWAY7_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

}
