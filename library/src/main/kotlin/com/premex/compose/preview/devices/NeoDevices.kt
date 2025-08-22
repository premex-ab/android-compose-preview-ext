package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Neo device specifications for Android Compose previews.
 *
 * This extension provides Neo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Neo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Neo get() = object {
    /** Neo GF215-REY */
    val GF215_REY = "spec:width=800,height=1280,unit=px,dpi=160"

}
