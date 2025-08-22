package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unonu device specifications for Android Compose previews.
 *
 * This extension provides Unonu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unonu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unonu get() = object {
    /** Unonu N63A */
    val N63A = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Unonu UN55L */
    val UN55L = "spec:width=444,height=960,unit=px,dpi=213"

    /** Unonu UNONU_N55S */
    val UNONU_N55S = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Unonu UNONU N65 LITE */
    val UNONU_N65_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Unonu UNONU U4001 */
    val UNONU_U4001 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Unonu UNONU_W609 */
    val UNONU_W609 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Unonu UNONU W61 */
    val UNONU_W61 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Unonu UT3G */
    val UT3G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Unonu UT3GPlus */
    val UT3GPLUS = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Unonu W50A */
    val W50A = "spec:width=480,height=854,unit=px,dpi=240"

    /** Unonu W57A */
    val W57A = "spec:width=480,height=960,unit=px,dpi=240"

    /** Unonu X4G */
    val X4G = "spec:width=480,height=800,unit=px,dpi=240"

}
