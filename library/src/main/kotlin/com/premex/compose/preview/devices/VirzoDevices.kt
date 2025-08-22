package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Virzo device specifications for Android Compose previews.
 *
 * This extension provides Virzo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Virzo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Virzo get() = object {
    /** Virzo V511 */
    val V511 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Virzo V608C  */
    val V608C = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Virzo VT1001 */
    val VT1001 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Virzo VT701 */
    val VT701 = "spec:width=600,height=1024,unit=px,dpi=213"

}
