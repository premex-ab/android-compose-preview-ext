package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maze device specifications for Android Compose previews.
 *
 * This extension provides Maze device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maze.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maze get() = object {
    /** Maze Alpha */
    val ALPHA = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Maze Alpha_X */
    val ALPHA_X = "spec:width=1080,height=2160,unit=px,dpi=480"

}
