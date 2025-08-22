package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Phonemax device specifications for Android Compose previews.
 *
 * This extension provides Phonemax device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Phonemax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Phonemax get() = object {
    /** Phonemax M10 */
    val M10 = "spec:width=1080,height=2280,unit=px,dpi=480"

    /** Phonemax M3PRO */
    val M3PRO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Phonemax P1000 */
    val P1000 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Phonemax P20 Pro  */
    val P20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Phonemax R4 GT */
    val R4_GT = "spec:width=540,height=1200,unit=px,dpi=280"

    /** Phonemax X1 */
    val X1 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Phonemax X1_Pro */
    val X1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

}
