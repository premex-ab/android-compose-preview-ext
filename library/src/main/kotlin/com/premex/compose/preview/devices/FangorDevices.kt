package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fangor device specifications for Android Compose previews.
 *
 * This extension provides Fangor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fangor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fangor get() = object {
    /** Fangor F-863 */
    val F_863 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fangor F-C10 */
    val F_C10 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Fangor F-X10 */
    val F_X10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
