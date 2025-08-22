package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jenesis device specifications for Android Compose previews.
 *
 * This extension provides Jenesis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jenesis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jenesis get() = object {
    /** Jenesis A94GT_Plus */
    val A94GT_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jenesis JT07-81B */
    val JT07_81B = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Jenesis JT10-81B */
    val JT10_81B = "spec:width=800,height=1280,unit=px,dpi=160"

}
