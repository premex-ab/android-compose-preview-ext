package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Etalk device specifications for Android Compose previews.
 *
 * This extension provides Etalk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Etalk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Etalk get() = object {
    /** Etalk KAZ-N20 */
    val KAZ_N20 = "spec:width=720,height=1280,unit=px,dpi=320"

}
