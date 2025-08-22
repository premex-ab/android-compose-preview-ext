package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cilico device specifications for Android Compose previews.
 *
 * This extension provides Cilico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cilico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cilico get() = object {
    /** Cilico C6 */
    val C6 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cilico C7X */
    val C7X = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Cilico C80 */
    val C80 = "spec:width=720,height=1440,unit=px,dpi=320"

}
