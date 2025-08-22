package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kgtel device specifications for Android Compose previews.
 *
 * This extension provides Kgtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kgtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kgtel get() = object {
    /** Kgtel A56 */
    val A56 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Kgtel Better10 */
    val BETTER10 = "spec:width=480,height=960,unit=px,dpi=216"

    /** Kgtel Hello 10 Pro 4G */
    val HELLO_10_PRO_4G = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kgtel Mate_20_Pro_4G */
    val MATE_20_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Kgtel Nova_10_Pro_4G */
    val NOVA_10_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Kgtel R10 */
    val R10 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kgtel X5 */
    val X5 = "spec:width=540,height=960,unit=px,dpi=240"

    /** Kgtel X55E */
    val X55E = "spec:width=480,height=960,unit=px,dpi=213"

}
