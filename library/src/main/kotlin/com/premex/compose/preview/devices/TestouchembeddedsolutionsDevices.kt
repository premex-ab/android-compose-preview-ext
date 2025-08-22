package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Testouchembeddedsolutions device specifications for Android Compose previews.
 *
 * This extension provides Testouchembeddedsolutions device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Testouchembeddedsolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Testouchembeddedsolutions get() = object {
    /** Testouchembeddedsolutions igs-series */
    val IGS_SERIES = "spec:width=1080,height=1920,unit=px,dpi=160"

    /** Testouchembeddedsolutions igs-series-gen2 */
    val IGS_SERIES_GEN2 = "spec:width=1080,height=1920,unit=px,dpi=160"

}
