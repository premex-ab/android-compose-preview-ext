package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zoji device specifications for Android Compose previews.
 *
 * This extension provides Zoji device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zoji.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zoji get() = object {
    /** Zoji Z11 */
    val Z11 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Zoji Z33 */
    val Z33 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Zoji Z9 */
    val Z9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
