package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eksmobility device specifications for Android Compose previews.
 *
 * This extension provides Eksmobility device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eksmobility.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eksmobility get() = object {
    /** Eksmobility S5LS */
    val S5LS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Eksmobility T4 */
    val T4 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Eksmobility X6 */
    val X6 = "spec:width=480,height=960,unit=px,dpi=213"

    /** Eksmobility x7 */
    val X7 = "spec:width=600,height=1024,unit=px,dpi=186"

    /** Eksmobility Z5 */
    val Z5 = "spec:width=320,height=385,unit=px,dpi=160"

}
