package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Domobile device specifications for Android Compose previews.
 *
 * This extension provides Domobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Domobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Domobile get() = object {
    /** Domobile Mate6 Pro */
    val MATE6_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

}
