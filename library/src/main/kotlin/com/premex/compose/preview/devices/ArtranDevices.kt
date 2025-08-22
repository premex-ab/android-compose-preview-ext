package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Artran device specifications for Android Compose previews.
 *
 * This extension provides Artran device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Artran.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Artran get() = object {
    /** Artran ARTRAN _EI101F */
    val ARTRAN_EI101F = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Artran AZ101F */
    val AZ101F = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Artran IB101F_Pro */
    val IB101F_PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Artran IB868H */
    val IB868H = "spec:width=800,height=1340,unit=px,dpi=180"

}
