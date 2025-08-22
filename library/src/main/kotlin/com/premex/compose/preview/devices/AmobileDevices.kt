package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Amobile device specifications for Android Compose previews.
 *
 * This extension provides Amobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Amobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Amobile get() = object {
    /** Amobile PD470 */
    val PD470 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Amobile PD602 */
    val PD602 = "spec:width=720,height=1440,unit=px,dpi=280"

}
