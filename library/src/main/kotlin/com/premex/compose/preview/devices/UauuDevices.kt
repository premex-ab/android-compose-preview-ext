package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Uauu device specifications for Android Compose previews.
 *
 * This extension provides Uauu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Uauu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Uauu get() = object {
    /** Uauu M10 */
    val M10 = "spec:width=1536,height=2048,unit=px,dpi=240"

    /** Uauu T30 */
    val T30 = "spec:width=1200,height=1920,unit=px,dpi=304"

    /** Uauu T30Pro */
    val T30PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Uauu T60 */
    val T60 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Uauu T90_NEW */
    val T90_NEW = "spec:width=1200,height=1920,unit=px,dpi=272"

    /** Uauu U10_RU */
    val U10_RU = "spec:width=800,height=1280,unit=px,dpi=160"

}
