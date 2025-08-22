package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * V2com device specifications for Android Compose previews.
 *
 * This extension provides V2com device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.V2com.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.V2com get() = object {
    /** V2com T2 */
    val T2 = "spec:width=720,height=1440,unit=px,dpi=320"

}
