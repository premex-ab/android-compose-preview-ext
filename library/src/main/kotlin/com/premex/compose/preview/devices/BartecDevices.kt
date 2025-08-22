package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bartec device specifications for Android Compose previews.
 *
 * This extension provides Bartec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bartec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bartec get() = object {
    /** Bartec BARTEC SP9EX1 Smartphone */
    val BARTEC_SP9EX1_SMARTPHONE = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Bartec Pixavi Phone */
    val PIXAVI_PHONE = "spec:width=1080,height=1920,unit=px,dpi=480"

}
