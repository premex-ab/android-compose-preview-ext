package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iyou device specifications for Android Compose previews.
 *
 * This extension provides Iyou device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iyou.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iyou get() = object {
    /** Iyou A10 */
    val A10 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Iyou A30 */
    val A30 = "spec:width=720,height=1600,unit=px,dpi=320"

}
