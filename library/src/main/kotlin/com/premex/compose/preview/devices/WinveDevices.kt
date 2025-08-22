package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Winve device specifications for Android Compose previews.
 *
 * This extension provides Winve device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Winve.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Winve get() = object {
    /** Winve M3 */
    val M3 = "spec:width=480,height=854,unit=px,dpi=213"

    /** Winve M5plus */
    val M5PLUS = "spec:width=720,height=1280,unit=px,dpi=300"

    /** Winve N4 */
    val N4 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Winve N4plus */
    val N4PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Winve Q9 */
    val Q9 = "spec:width=720,height=1440,unit=px,dpi=320"

}
