package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Apex device specifications for Android Compose previews.
 *
 * This extension provides Apex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Apex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Apex get() = object {
    /** Apex P10HD_Lite */
    val P10HD_LITE = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Apex R10D */
    val R10D = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Apex T40PRO_L1 */
    val T40PRO_L1 = "spec:width=1200,height=2000,unit=px,dpi=280"

    /** Apex U10 */
    val U10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Apex U10PRO */
    val U10PRO = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Apex Z12_PRO */
    val Z12_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

    /** Apex Z4PRO */
    val Z4PRO = "spec:width=1200,height=2000,unit=px,dpi=320"

}
