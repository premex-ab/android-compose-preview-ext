package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pipo device specifications for Android Compose previews.
 *
 * This extension provides Pipo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pipo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pipo get() = object {
    /** Pipo IconX_P109 */
    val ICONX_P109 = "spec:width=800,height=1280,unit=px,dpi=213"

}
