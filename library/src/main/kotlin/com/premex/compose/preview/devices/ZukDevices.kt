package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zuk device specifications for Android Compose previews.
 *
 * This extension provides Zuk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zuk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zuk get() = object {
    /** Zuk Lenovo Z2 Plus */
    val LENOVO_Z2_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zuk Z1 */
    val Z1 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zuk Z2 */
    val Z2 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zuk Z2 Pro */
    val Z2_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Zuk ZTE BLADE A5 PRO */
    val ZTE_BLADE_A5_PRO = "spec:width=480,height=800,unit=px,dpi=240"

}
