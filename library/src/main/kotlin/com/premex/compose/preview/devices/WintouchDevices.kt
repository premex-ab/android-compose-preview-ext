package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Wintouch device specifications for Android Compose previews.
 *
 * This extension provides Wintouch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Wintouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Wintouch get() = object {
    /** Wintouch A20 */
    val A20 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wintouch A50 */
    val A50 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Wintouch K19 */
    val K19 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Wintouch Q705 */
    val Q705 = "spec:width=600,height=1024,unit=px,dpi=160"

}
