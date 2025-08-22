package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Memobile device specifications for Android Compose previews.
 *
 * This extension provides Memobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Memobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Memobile get() = object {
    /** Memobile Grace 9 */
    val GRACE_9 = "spec:width=720,height=1600,unit=px,dpi=320"

}
