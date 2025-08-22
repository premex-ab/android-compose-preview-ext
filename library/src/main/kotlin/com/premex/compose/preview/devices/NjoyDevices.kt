package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Njoy device specifications for Android Compose previews.
 *
 * This extension provides Njoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Njoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Njoy get() = object {
    /** Njoy nJoy Theia 10 */
    val NJOY_THEIA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
