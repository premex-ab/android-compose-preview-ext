package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxtron device specifications for Android Compose previews.
 *
 * This extension provides Maxtron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxtron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxtron get() = object {
    /** Maxtron MAXTRON Genio */
    val MAXTRON_GENIO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Maxtron smart */
    val SMART = "spec:width=600,height=1024,unit=px,dpi=213"

}
