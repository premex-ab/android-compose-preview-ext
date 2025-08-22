package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Volkano device specifications for Android Compose previews.
 *
 * This extension provides Volkano device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Volkano.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Volkano get() = object {
    /** Volkano VK_740_12 */
    val VK_740_12 = "spec:width=600,height=1024,unit=px,dpi=160"

}
