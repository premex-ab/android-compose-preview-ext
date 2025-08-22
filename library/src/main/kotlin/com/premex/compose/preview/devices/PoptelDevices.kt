package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Poptel device specifications for Android Compose previews.
 *
 * This extension provides Poptel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Poptel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Poptel get() = object {
    /** Poptel P60 */
    val P60 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Poptel P8 */
    val P8 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Poptel P9000 MAX */
    val P9000_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Poptel POPTEL P10 */
    val POPTEL_P10 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Poptel V9 */
    val V9 = "spec:width=800,height=1280,unit=px,dpi=320"

}
