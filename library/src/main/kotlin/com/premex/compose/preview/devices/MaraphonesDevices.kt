package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maraphones device specifications for Android Compose previews.
 *
 * This extension provides Maraphones device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maraphones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maraphones get() = object {
    /** Maraphones Mara Phones R */
    val MARA_PHONES_R = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Maraphones Mara S */
    val MARA_S = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maraphones Mara X */
    val MARA_X = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Maraphones 	Mara X1 */
    val MARA_X1 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Maraphones Mara X1 d */
    val MARA_X1_D = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Maraphones Mara X dual */
    val MARA_X_DUAL = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Maraphones MARA Z */
    val MARA_Z = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Maraphones 	Mara  Z1 */
    val MARA_Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maraphones Mara Z1 d */
    val MARA_Z1_D = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Maraphones Mara Z d */
    val MARA_Z_D = "spec:width=720,height=1440,unit=px,dpi=320"

}
