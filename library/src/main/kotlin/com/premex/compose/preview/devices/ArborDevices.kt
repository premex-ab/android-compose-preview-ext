package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Arbor device specifications for Android Compose previews.
 *
 * This extension provides Arbor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Arbor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Arbor get() = object {
    /** Arbor G47 */
    val G47 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Arbor GT78-VN */
    val GT78_VN = "spec:width=800,height=1280,unit=px,dpi=240"

}
