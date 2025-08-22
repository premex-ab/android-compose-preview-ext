package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Baykus device specifications for Android Compose previews.
 *
 * This extension provides Baykus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Baykus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Baykus get() = object {
    /** Baykus BKM10 */
    val BKM10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
