package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nexttechnologies device specifications for Android Compose previews.
 *
 * This extension provides Nexttechnologies device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nexttechnologies.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nexttechnologies get() = object {
    /** Nexttechnologies N7526 */
    val N7526 = "spec:width=480,height=800,unit=px,dpi=120"

}
