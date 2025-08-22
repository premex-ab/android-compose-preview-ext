package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chinamobile device specifications for Android Compose previews.
 *
 * This extension provides Chinamobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chinamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chinamobile get() = object {
    /** Chinamobile A3 */
    val A3 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Chinamobile M762G */
    val M762G = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Chinamobile n1 max */
    val N1_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

}
