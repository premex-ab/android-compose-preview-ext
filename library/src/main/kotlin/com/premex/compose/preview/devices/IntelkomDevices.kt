package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Intelkom device specifications for Android Compose previews.
 *
 * This extension provides Intelkom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Intelkom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Intelkom get() = object {
    /** Intelkom meanIT_X2 */
    val MEANIT_X2 = "spec:width=480,height=960,unit=px,dpi=240"

}
