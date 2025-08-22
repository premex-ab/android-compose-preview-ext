package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mimio device specifications for Android Compose previews.
 *
 * This extension provides Mimio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mimio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mimio get() = object {
    /** Mimio MimioPro-G XX5 */
    val MIMIOPRO_G_XX5 = "spec:width=2160,height=3840,unit=px,dpi=480"

}
