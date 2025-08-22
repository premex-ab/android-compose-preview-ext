package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Getac device specifications for Android Compose previews.
 *
 * This extension provides Getac device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Getac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Getac get() = object {
    /** Getac ZX10 */
    val ZX10 = "spec:width=1200,height=1920,unit=px,dpi=260"

    /** Getac ZX70 */
    val ZX70 = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Getac ZX70G2 */
    val ZX70G2 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Getac ZX80 */
    val ZX80 = "spec:width=1200,height=1920,unit=px,dpi=260"

}
