package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zigo device specifications for Android Compose previews.
 *
 * This extension provides Zigo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zigo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zigo get() = object {
    /** Zigo Zigo_Nebula_10_1 */
    val ZIGO_NEBULA_10_1 = "spec:width=800,height=1280,unit=px,dpi=214"

}
