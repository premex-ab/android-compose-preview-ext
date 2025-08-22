package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Homii device specifications for Android Compose previews.
 *
 * This extension provides Homii device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Homii.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Homii get() = object {
    /** Homii HOMII M6 */
    val HOMII_M6 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Homii XBOOK */
    val XBOOK = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Homii XBOOK_12 */
    val XBOOK_12 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Homii Xbookkids */
    val XBOOKKIDS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Homii Xbook_Plus */
    val XBOOK_PLUS = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Homii XBOOK_PRO */
    val XBOOK_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
