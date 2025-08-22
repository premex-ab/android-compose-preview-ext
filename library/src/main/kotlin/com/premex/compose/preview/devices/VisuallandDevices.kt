package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Visualland device specifications for Android Compose previews.
 *
 * This extension provides Visualland device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Visualland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Visualland get() = object {
    /** Visualland Elite10QH */
    val ELITE10QH = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Visualland Elite10QHPro */
    val ELITE10QHPRO = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Visualland Prestige Elite10QL */
    val PRESTIGE_ELITE10QL = "spec:width=600,height=1024,unit=px,dpi=120"

}
