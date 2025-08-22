package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Alphawolf device specifications for Android Compose previews.
 *
 * This extension provides Alphawolf device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Alphawolf.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Alphawolf get() = object {
    /** Alphawolf A1 */
    val A1 = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Alphawolf L2 */
    val L2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Alphawolf L3 */
    val L3 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
