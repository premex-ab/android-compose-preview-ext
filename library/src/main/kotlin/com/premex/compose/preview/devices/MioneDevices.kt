package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mione device specifications for Android Compose previews.
 *
 * This extension provides Mione device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mione.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mione get() = object {
    /** Mione M-701Plus */
    val M_701PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mione Mione_Pro */
    val MIONE_PRO = "spec:width=720,height=1560,unit=px,dpi=240"

    /** Mione Mione_Pro_Plus  */
    val MIONE_PRO_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Mione mione_S20 */
    val MIONE_S20 = "spec:width=720,height=1560,unit=px,dpi=320"

}
