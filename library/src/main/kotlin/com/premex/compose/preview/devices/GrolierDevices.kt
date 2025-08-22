package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Grolier device specifications for Android Compose previews.
 *
 * This extension provides Grolier device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Grolier.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Grolier get() = object {
    /** Grolier GSR */
    val GSR = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Grolier GSR2 */
    val GSR2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
