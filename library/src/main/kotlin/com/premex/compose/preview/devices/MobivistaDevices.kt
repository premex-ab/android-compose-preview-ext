package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobivista device specifications for Android Compose previews.
 *
 * This extension provides Mobivista device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobivista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobivista get() = object {
    /** Mobivista MVT_1001 */
    val MVT_1001 = "spec:width=800,height=1280,unit=px,dpi=213"

}
