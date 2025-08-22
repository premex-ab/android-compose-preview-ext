package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imto device specifications for Android Compose previews.
 *
 * This extension provides Imto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imto get() = object {
    /** Imto GKL089 */
    val GKL089 = "spec:width=800,height=1280,unit=px,dpi=160"

}
