package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Audiag device specifications for Android Compose previews.
 *
 * This extension provides Audiag device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Audiag.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Audiag get() = object {
    /** Audiag RSE-III */
    val RSE_III = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Audiag SDIS1 */
    val SDIS1 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
