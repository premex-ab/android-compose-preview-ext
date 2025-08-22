package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxcom device specifications for Android Compose previews.
 *
 * This extension provides Maxcom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxcom get() = object {
    /** Maxcom MS457 */
    val MS457 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Maxcom MS457PLUS */
    val MS457PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Maxcom MS459 */
    val MS459 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Maxcom MS507_STRONG */
    val MS507_STRONG = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxcom MS515 */
    val MS515 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxcom MS554_eea */
    val MS554_EEA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Maxcom MS571 */
    val MS571 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Maxcom MS572 */
    val MS572 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Maxcom MS651 */
    val MS651 = "spec:width=720,height=1600,unit=px,dpi=320"

}
