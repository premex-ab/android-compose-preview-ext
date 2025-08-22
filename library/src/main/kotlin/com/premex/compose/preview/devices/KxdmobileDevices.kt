package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kxdmobile device specifications for Android Compose previews.
 *
 * This extension provides Kxdmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kxdmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kxdmobile get() = object {
    /** Kxdmobile A06 */
    val A06 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Kxdmobile A07 */
    val A07 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Kxdmobile A08 */
    val A08 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Kxdmobile A11 */
    val A11 = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Kxdmobile Blus Sea S25 Plus */
    val BLUS_SEA_S25_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Kxdmobile D68S */
    val D68S = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Kxdmobile Universe S24_Plus */
    val UNIVERSE_S24_PLUS = "spec:width=720,height=1612,unit=px,dpi=480"

}
