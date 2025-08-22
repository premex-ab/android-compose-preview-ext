package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Brigmton device specifications for Android Compose previews.
 *
 * This extension provides Brigmton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Brigmton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Brigmton get() = object {
    /** Brigmton BTPC-1023OC4G_EEA */
    val BTPC_1023OC4G_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Brigmton BTPC-1025OC */
    val BTPC_1025OC = "spec:width=800,height=1280,unit=px,dpi=213"

}
