package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hoco device specifications for Android Compose previews.
 *
 * This extension provides Hoco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hoco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hoco get() = object {
    /** Hoco hoco_HI10 */
    val HOCO_HI10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hoco hoco_HI11 */
    val HOCO_HI11 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Hoco hoco_HI12 */
    val HOCO_HI12 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Hoco hoco_HI14 */
    val HOCO_HI14 = "spec:width=800,height=1280,unit=px,dpi=213"

}
