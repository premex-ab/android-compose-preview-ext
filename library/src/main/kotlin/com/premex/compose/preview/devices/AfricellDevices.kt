package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Africell device specifications for Android Compose previews.
 *
 * This extension provides Africell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Africell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Africell get() = object {
    /** Africell S10 */
    val S10 = "spec:width=480,height=960,unit=px,dpi=200"

}
