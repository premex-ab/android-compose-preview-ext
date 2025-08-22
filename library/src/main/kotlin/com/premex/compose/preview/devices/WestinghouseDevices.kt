package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Westinghouse device specifications for Android Compose previews.
 *
 * This extension provides Westinghouse device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Westinghouse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Westinghouse get() = object {
    /** Westinghouse W10TWF19 */
    val W10TWF19 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Westinghouse WH10S9863232 */
    val WH10S9863232 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
