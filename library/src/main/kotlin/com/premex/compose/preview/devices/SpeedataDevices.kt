package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Speedata device specifications for Android Compose previews.
 *
 * This extension provides Speedata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Speedata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Speedata get() = object {
    /** Speedata FG60 */
    val FG60 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Speedata SD100 */
    val SD100 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
