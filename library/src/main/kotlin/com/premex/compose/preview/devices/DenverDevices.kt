package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Denver device specifications for Android Compose previews.
 *
 * This extension provides Denver device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Denver.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Denver get() = object {
    /** Denver TIO_80 */
    val TIO_80 = "spec:width=800,height=1280,unit=px,dpi=213"

}
