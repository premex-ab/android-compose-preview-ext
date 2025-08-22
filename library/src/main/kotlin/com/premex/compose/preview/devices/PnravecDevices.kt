package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pnravec device specifications for Android Compose previews.
 *
 * This extension provides Pnravec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pnravec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pnravec get() = object {
    /** Pnravec PN_RAVEC_TABLETTE */
    val PN_RAVEC_TABLETTE = "spec:width=1200,height=1920,unit=px,dpi=240"

}
