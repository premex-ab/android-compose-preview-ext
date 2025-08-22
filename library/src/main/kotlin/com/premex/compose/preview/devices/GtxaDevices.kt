package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gtxa device specifications for Android Compose previews.
 *
 * This extension provides Gtxa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gtxa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gtxa get() = object {
    /** Gtxa GTX_JACULUS */
    val GTX_JACULUS = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Gtxa GTX_JACULUS_01  */
    val GTX_JACULUS_01 = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Gtxa Jaculus_V2 */
    val JACULUS_V2 = "spec:width=1200,height=1920,unit=px,dpi=260"

}
