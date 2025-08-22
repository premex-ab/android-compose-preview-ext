package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Krosselegance device specifications for Android Compose previews.
 *
 * This extension provides Krosselegance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Krosselegance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Krosselegance get() = object {
    /** Krosselegance AS10LXPro */
    val AS10LXPRO = "spec:width=1200,height=2000,unit=px,dpi=320"

    /** Krosselegance KE-TB1032OF */
    val KE_TB1032OF = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Krosselegance KE-TB815 */
    val KE_TB815 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Krosselegance KE-TB816OF */
    val KE_TB816OF = "spec:width=800,height=1280,unit=px,dpi=213"

}
