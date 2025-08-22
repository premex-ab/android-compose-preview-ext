package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Egoboo device specifications for Android Compose previews.
 *
 * This extension provides Egoboo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Egoboo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Egoboo get() = object {
    /** Egoboo EB101 */
    val EB101 = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Egoboo EB104 */
    val EB104 = "spec:width=1200,height=2000,unit=px,dpi=280"

}
