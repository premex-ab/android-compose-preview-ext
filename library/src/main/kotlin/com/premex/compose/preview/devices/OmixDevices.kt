package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Omix device specifications for Android Compose previews.
 *
 * This extension provides Omix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Omix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Omix get() = object {
    /** Omix MixTab Pro */
    val MIXTAB_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Omix MixTab Pro 2 */
    val MIXTAB_PRO_2 = "spec:width=1200,height=2000,unit=px,dpi=360"

    /** Omix X2032 */
    val X2032 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Omix X3 */
    val X3 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Omix X300 */
    val X300 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Omix X4 */
    val X4 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Omix X400 */
    val X400 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Omix X5 */
    val X5 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Omix X500 */
    val X500 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Omix X6 */
    val X6 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Omix X600 */
    val X600 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Omix X600 NFC */
    val X600_NFC = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Omix X7 */
    val X7 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Omix X700 */
    val X700 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
