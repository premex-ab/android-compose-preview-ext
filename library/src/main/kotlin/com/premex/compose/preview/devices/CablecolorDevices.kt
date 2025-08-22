package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cablecolor device specifications for Android Compose previews.
 *
 * This extension provides Cablecolor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cablecolor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cablecolor get() = object {
    /** Cablecolor CAB_TAB */
    val CAB_TAB = "spec:width=600,height=1024,unit=px,dpi=213"

}
