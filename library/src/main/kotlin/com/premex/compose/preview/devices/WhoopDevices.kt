package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Whoop device specifications for Android Compose previews.
 *
 * This extension provides Whoop device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Whoop.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Whoop get() = object {
    /** Whoop TAB-8US2 */
    val TAB_8US2 = "spec:width=800,height=1280,unit=px,dpi=220"

}
