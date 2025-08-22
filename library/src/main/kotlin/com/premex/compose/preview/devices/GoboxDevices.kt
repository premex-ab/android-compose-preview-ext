package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gobox device specifications for Android Compose previews.
 *
 * This extension provides Gobox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gobox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gobox get() = object {
    /** Gobox T2 */
    val T2 = "spec:width=600,height=1024,unit=px,dpi=160"

}
