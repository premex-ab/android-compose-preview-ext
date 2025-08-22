package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stylos device specifications for Android Compose previews.
 *
 * This extension provides Stylos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stylos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stylos get() = object {
    /** Stylos Tab104 */
    val TAB104 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Stylos Tab2 */
    val TAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Stylos TAB8B */
    val TAB8B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Stylos TAB8F */
    val TAB8F = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Stylos TARISTAB2 */
    val TARISTAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

}
