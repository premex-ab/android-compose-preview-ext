package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trevi device specifications for Android Compose previews.
 *
 * This extension provides Trevi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trevi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trevi get() = object {
    /** Trevi KIDTAB_7_S04 */
    val KIDTAB_7_S04 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Trevi Tab104GS2 */
    val TAB104GS2 = "spec:width=800,height=1280,unit=px,dpi=213"

}
