package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vatenick device specifications for Android Compose previews.
 *
 * This extension provides Vatenick device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vatenick.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vatenick get() = object {
    /** Vatenick v7 */
    val V7 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Vatenick v7-EEA */
    val V7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
