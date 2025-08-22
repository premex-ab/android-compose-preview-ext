package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vaio device specifications for Android Compose previews.
 *
 * This extension provides Vaio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vaio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vaio get() = object {
    /** Vaio VA-10J */
    val VA_10J = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vaio VPA051 */
    val VPA051 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
