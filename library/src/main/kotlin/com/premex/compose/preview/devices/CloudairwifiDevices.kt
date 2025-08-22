package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cloudairwifi device specifications for Android Compose previews.
 *
 * This extension provides Cloudairwifi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cloudairwifi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cloudairwifi get() = object {
    /** Cloudairwifi ATab-1 */
    val ATAB_1 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
