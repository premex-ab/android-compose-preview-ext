package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Auzmai device specifications for Android Compose previews.
 *
 * This extension provides Auzmai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Auzmai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Auzmai get() = object {
    /** Auzmai V60 */
    val V60 = "spec:width=720,height=1560,unit=px,dpi=320"

}
