package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Daiyu device specifications for Android Compose previews.
 *
 * This extension provides Daiyu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Daiyu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Daiyu get() = object {
    /** Daiyu MBTWDY01 */
    val MBTWDY01 = "spec:width=1080,height=1920,unit=px,dpi=213"

}
