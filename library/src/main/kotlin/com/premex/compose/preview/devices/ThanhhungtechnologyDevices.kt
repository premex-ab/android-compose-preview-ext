package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Thanhhungtechnology device specifications for Android Compose previews.
 *
 * This extension provides Thanhhungtechnology device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Thanhhungtechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Thanhhungtechnology get() = object {
    /** Thanhhungtechnology HERO 9 */
    val HERO_9 = "spec:width=720,height=1600,unit=px,dpi=320"

}
