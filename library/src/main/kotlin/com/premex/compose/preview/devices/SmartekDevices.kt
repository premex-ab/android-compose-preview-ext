package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Smartek device specifications for Android Compose previews.
 *
 * This extension provides Smartek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Smartek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Smartek get() = object {
    /** Smartek MR_POTATO_HEAD */
    val MR_POTATO_HEAD = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Smartek PLAY_DOH */
    val PLAY_DOH = "spec:width=600,height=1024,unit=px,dpi=160"

}
