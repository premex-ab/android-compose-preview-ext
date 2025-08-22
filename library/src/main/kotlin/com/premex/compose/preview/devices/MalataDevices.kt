package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Malata device specifications for Android Compose previews.
 *
 * This extension provides Malata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Malata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Malata get() = object {
    /** Malata UV350 */
    val UV350 = "spec:width=720,height=1280,unit=px,dpi=320"

}
