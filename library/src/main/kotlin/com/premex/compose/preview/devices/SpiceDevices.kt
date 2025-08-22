package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Spice device specifications for Android Compose previews.
 *
 * This extension provides Spice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Spice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Spice get() = object {
    /** Spice F301 */
    val F301 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spice F302 */
    val F302 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spice F305 */
    val F305 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spice K601 */
    val K601 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Spice V801 */
    val V801 = "spec:width=720,height=1280,unit=px,dpi=320"

}
