package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Deyi device specifications for Android Compose previews.
 *
 * This extension provides Deyi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Deyi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Deyi get() = object {
    /** Deyi DEYI-10M18 */
    val DEYI_10M18 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Deyi DEYI10M18 */
    val DEYI10M18 = "spec:width=800,height=1280,unit=px,dpi=213"

}
