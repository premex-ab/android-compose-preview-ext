package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Akuvox device specifications for Android Compose previews.
 *
 * This extension provides Akuvox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Akuvox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Akuvox get() = object {
    /** Akuvox S567 */
    val S567 = "spec:width=800,height=1280,unit=px,dpi=160"

}
