package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oale device specifications for Android Compose previews.
 *
 * This extension provides Oale device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oale.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oale get() = object {
    /** Oale APEX1 */
    val APEX1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oale Apex2 */
    val APEX2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oale Apex3 */
    val APEX3 = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Oale dbx */
    val DBX = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Oale P2 */
    val P2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oale P3 */
    val P3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Oale P5S */
    val P5S = "spec:width=480,height=854,unit=px,dpi=240"

    /** Oale XS2_LTE */
    val XS2_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

}
