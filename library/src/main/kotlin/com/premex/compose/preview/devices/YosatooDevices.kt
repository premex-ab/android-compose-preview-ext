package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yosatoo device specifications for Android Compose previews.
 *
 * This extension provides Yosatoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yosatoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yosatoo get() = object {
    /** Yosatoo Y10 */
    val Y10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Yosatoo Y101 */
    val Y101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Yosatoo Y102 */
    val Y102 = "spec:width=800,height=1280,unit=px,dpi=160"

}
