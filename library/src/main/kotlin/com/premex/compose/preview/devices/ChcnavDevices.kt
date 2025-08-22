package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Chcnav device specifications for Android Compose previews.
 *
 * This extension provides Chcnav device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Chcnav.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Chcnav get() = object {
    /** Chcnav HCE600 */
    val HCE600 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Chcnav LT60H */
    val LT60H = "spec:width=1080,height=2340,unit=px,dpi=420"

    /** Chcnav LT700 */
    val LT700 = "spec:width=1200,height=1920,unit=px,dpi=306"

    /** Chcnav LT800 */
    val LT800 = "spec:width=1200,height=1920,unit=px,dpi=360"

}
