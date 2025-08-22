package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tps device specifications for Android Compose previews.
 *
 * This extension provides Tps device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tps.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tps get() = object {
    /** Tps ALTAB08 */
    val ALTAB08 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Tps K1091F */
    val K1091F = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Tps TPS-SC10 */
    val TPS_SC10 = "spec:width=1200,height=1920,unit=px,dpi=280"

}
