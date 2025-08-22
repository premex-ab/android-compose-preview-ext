package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ployer device specifications for Android Compose previews.
 *
 * This extension provides Ployer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ployer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ployer get() = object {
    /** Ployer A1190 */
    val A1190 = "spec:width=800,height=1280,unit=px,dpi=213"

}
