package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lepan device specifications for Android Compose previews.
 *
 * This extension provides Lepan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lepan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lepan get() = object {
    /** Lepan TC802A */
    val TC802A = "spec:width=768,height=1024,unit=px,dpi=160"

}
