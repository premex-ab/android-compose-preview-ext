package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Abctech device specifications for Android Compose previews.
 *
 * This extension provides Abctech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Abctech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Abctech get() = object {
    /** Abctech PG11 */
    val PG11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Abctech X20 */
    val X20 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
