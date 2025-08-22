package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vkworld device specifications for Android Compose previews.
 *
 * This extension provides Vkworld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vkworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vkworld get() = object {
    /** Vkworld S8 */
    val S8 = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Vkworld VK7000 */
    val VK7000 = "spec:width=720,height=1280,unit=px,dpi=320"

}
