package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prestigiosolutions device specifications for Android Compose previews.
 *
 * This extension provides Prestigiosolutions device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prestigiosolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prestigiosolutions get() = object {
    /** Prestigiosolutions PSTA111 */
    val PSTA111 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigiosolutions Virtuoso PSTA101 */
    val VIRTUOSO_PSTA101 = "spec:width=1200,height=2000,unit=px,dpi=280"

}
