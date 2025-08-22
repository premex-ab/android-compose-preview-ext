package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartex device specifications for Android Compose previews.
 *
 * This extension provides Smartex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartex get() = object {
    /** Smartex M520 */
    val M520 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Smartex M530 */
    val M530 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Smartex M700 */
    val M700 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Smartex P600 */
    val P600 = "spec:width=480,height=960,unit=px,dpi=240"

}
