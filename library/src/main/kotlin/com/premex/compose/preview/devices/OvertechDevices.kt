package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Overtech device specifications for Android Compose previews.
 *
 * This extension provides Overtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Overtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Overtech get() = object {
    /** Overtech OX7A */
    val OX7A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Overtech OX7S */
    val OX7S = "spec:width=600,height=1024,unit=px,dpi=160"

}
