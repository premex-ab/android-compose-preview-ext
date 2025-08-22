package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Buddyphone device specifications for Android Compose previews.
 *
 * This extension provides Buddyphone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Buddyphone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Buddyphone get() = object {
    /** Buddyphone P1 */
    val P1 = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Buddyphone P2 */
    val P2 = "spec:width=480,height=960,unit=px,dpi=240"

}
