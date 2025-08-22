package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Blueworld device specifications for Android Compose previews.
 *
 * This extension provides Blueworld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Blueworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Blueworld get() = object {
    /** Blueworld TM12 */
    val TM12 = "spec:width=720,height=1560,unit=px,dpi=320"

}
