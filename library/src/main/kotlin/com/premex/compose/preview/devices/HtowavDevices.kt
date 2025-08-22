package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Htowav device specifications for Android Compose previews.
 *
 * This extension provides Htowav device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Htowav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Htowav get() = object {
    /** Htowav Cyber 13 */
    val CYBER_13 = "spec:width=720,height=1612,unit=px,dpi=300"

}
