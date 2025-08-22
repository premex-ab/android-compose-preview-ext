package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Artel device specifications for Android Compose previews.
 *
 * This extension provides Artel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Artel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Artel get() = object {
    /** Artel ALO */
    val ALO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel Artel Air */
    val ARTEL_AIR = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Artel Artel_Premium */
    val ARTEL_PREMIUM = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Artel Artel Quadro */
    val ARTEL_QUADRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Artel Artel Quadro Pro */
    val ARTEL_QUADRO_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Artel Artel_T10 */
    val ARTEL_T10 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Artel Artel Tesla */
    val ARTEL_TESLA = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Artel Artel Tomchi */
    val ARTEL_TOMCHI = "spec:width=480,height=854,unit=px,dpi=240"

    /** Artel Artel U5 */
    val ARTEL_U5 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Artel GAP YOQ */
    val GAP_YOQ = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel GAPYOQ */
    val GAPYOQ = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel U2 */
    val U2 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel U3 */
    val U3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel U3 4G */
    val U3_4G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Artel U4 */
    val U4 = "spec:width=720,height=1440,unit=px,dpi=320"

}
