package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Paxcn device specifications for Android Compose previews.
 *
 * This extension provides Paxcn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Paxcn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Paxcn get() = object {
    /** Paxcn A50 */
    val A50 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Paxcn A77 */
    val A77 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Paxcn M30 */
    val M30 = "spec:width=720,height=1440,unit=px,dpi=320"

}
