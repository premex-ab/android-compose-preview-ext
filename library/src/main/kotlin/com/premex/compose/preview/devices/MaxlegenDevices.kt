package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxlegen device specifications for Android Compose previews.
 *
 * This extension provides Maxlegen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxlegen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxlegen get() = object {
    /** Maxlegen M621 */
    val M621 = "spec:width=1400,height=2240,unit=px,dpi=240"

    /** Maxlegen M621-EEA */
    val M621_EEA = "spec:width=1400,height=2240,unit=px,dpi=240"

}
