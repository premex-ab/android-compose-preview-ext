package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bauhn device specifications for Android Compose previews.
 *
 * This extension provides Bauhn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bauhn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bauhn get() = object {
    /** Bauhn ATAB10-1224 */
    val ATAB10_1224 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Bauhn ATAB7-0125 */
    val ATAB7_0125 = "spec:width=600,height=1024,unit=px,dpi=160"

}
