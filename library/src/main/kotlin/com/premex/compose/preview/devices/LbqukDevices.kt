package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lbquk device specifications for Android Compose previews.
 *
 * This extension provides Lbquk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lbquk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lbquk get() = object {
    /** Lbquk LbQ_F8v2 */
    val LBQ_F8V2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
