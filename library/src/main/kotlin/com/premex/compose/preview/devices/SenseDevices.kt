package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sense device specifications for Android Compose previews.
 *
 * This extension provides Sense device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sense.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sense get() = object {
    /** Sense TW102 */
    val TW102 = "spec:width=720,height=1560,unit=px,dpi=320"

}
