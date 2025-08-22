package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Daymark device specifications for Android Compose previews.
 *
 * This extension provides Daymark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Daymark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Daymark get() = object {
    /** Daymark IT119345 */
    val IT119345 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Daymark IT119411 */
    val IT119411 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
