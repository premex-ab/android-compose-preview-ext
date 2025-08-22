package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Figgers device specifications for Android Compose previews.
 *
 * This extension provides Figgers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Figgers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Figgers get() = object {
    /** Figgers Figgers DragonX */
    val FIGGERS_DRAGONX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Figgers Figgers F3 */
    val FIGGERS_F3 = "spec:width=1080,height=2246,unit=px,dpi=480"

}
