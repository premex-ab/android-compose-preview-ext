package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pixpro device specifications for Android Compose previews.
 *
 * This extension provides Pixpro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pixpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pixpro get() = object {
    /** Pixpro PIXPRO L1 PRO */
    val PIXPRO_L1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Pixpro VisionTab_10 */
    val VISIONTAB_10 = "spec:width=800,height=1280,unit=px,dpi=180"

}
