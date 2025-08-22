package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pawbo device specifications for Android Compose previews.
 *
 * This extension provides Pawbo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pawbo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pawbo get() = object {
    /** Pawbo Tab-T13 */
    val TAB_T13 = "spec:width=1080,height=1920,unit=px,dpi=210"

    /** Pawbo Tab-T8 */
    val TAB_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

}
