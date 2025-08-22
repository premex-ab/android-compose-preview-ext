package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Agno device specifications for Android Compose previews.
 *
 * This extension provides Agno device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Agno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Agno get() = object {
    /** Agno TAIG717A */
    val TAIG717A = "spec:width=800,height=1340,unit=px,dpi=213"

}
