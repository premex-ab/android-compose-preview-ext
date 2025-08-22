package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hqbel device specifications for Android Compose previews.
 *
 * This extension provides Hqbel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hqbel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hqbel get() = object {
    /** Hqbel Tablet_HQ_T616 */
    val TABLET_HQ_T616 = "spec:width=800,height=1280,unit=px,dpi=213"

}
