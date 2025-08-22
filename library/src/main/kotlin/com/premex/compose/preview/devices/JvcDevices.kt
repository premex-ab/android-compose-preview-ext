package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jvc device specifications for Android Compose previews.
 *
 * This extension provides Jvc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jvc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jvc get() = object {
    /** Jvc AV-08NT310 */
    val AV_08NT310 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Jvc AV-10NT310 */
    val AV_10NT310 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jvc AV-11NT510 */
    val AV_11NT510 = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Jvc JVC J20 */
    val JVC_J20 = "spec:width=1080,height=2160,unit=px,dpi=480"

}
