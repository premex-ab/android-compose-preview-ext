package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Casio device specifications for Android Compose previews.
 *
 * This extension provides Casio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Casio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Casio get() = object {
    /** Casio DT-X400 */
    val DT_X400 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Casio dtx450 */
    val DTX450 = "spec:width=480,height=800,unit=px,dpi=220"

    /** Casio ET-L10 */
    val ET_L10 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Casio IT-G400 */
    val IT_G400 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Casio itg600 */
    val ITG600 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Casio IT-G650 */
    val IT_G650 = "spec:width=720,height=1440,unit=px,dpi=320"

}
