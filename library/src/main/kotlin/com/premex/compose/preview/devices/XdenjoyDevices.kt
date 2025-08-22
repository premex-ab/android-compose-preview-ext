package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xdenjoy device specifications for Android Compose previews.
 *
 * This extension provides Xdenjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xdenjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xdenjoy get() = object {
    /** Xdenjoy XDDGM10 */
    val XDDGM10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Xdenjoy XDDGM11BS */
    val XDDGM11BS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Xdenjoy XDDGM99PM */
    val XDDGM99PM = "spec:width=800,height=1280,unit=px,dpi=213"

}
