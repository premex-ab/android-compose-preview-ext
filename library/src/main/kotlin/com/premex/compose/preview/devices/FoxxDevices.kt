package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Foxx device specifications for Android Compose previews.
 *
 * This extension provides Foxx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Foxx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Foxx get() = object {
    /** Foxx A55AM */
    val A55AM = "spec:width=480,height=960,unit=px,dpi=200"

    /** Foxx V8 */
    val V8 = "spec:width=800,height=1280,unit=px,dpi=240"

}
