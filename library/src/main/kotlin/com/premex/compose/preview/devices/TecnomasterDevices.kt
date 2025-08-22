package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tecnomaster device specifications for Android Compose previews.
 *
 * This extension provides Tecnomaster device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tecnomaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tecnomaster get() = object {
    /** Tecnomaster EDT800 */
    val EDT800 = "spec:width=800,height=1280,unit=px,dpi=160"

}
