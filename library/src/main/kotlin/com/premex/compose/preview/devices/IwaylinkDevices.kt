package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iwaylink device specifications for Android Compose previews.
 *
 * This extension provides Iwaylink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iwaylink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iwaylink get() = object {
    /** Iwaylink MC401 */
    val MC401 = "spec:width=1600,height=2560,unit=px,dpi=160"

    /** Iwaylink TC601 */
    val TC601 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Iwaylink TC601B */
    val TC601B = "spec:width=1080,height=2160,unit=px,dpi=480"

}
