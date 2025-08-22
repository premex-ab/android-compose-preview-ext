package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Infone device specifications for Android Compose previews.
 *
 * This extension provides Infone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Infone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Infone get() = object {
    /** Infone INFONE XE */
    val INFONE_XE = "spec:width=480,height=960,unit=px,dpi=204"

}
