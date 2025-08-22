package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Imin device specifications for Android Compose previews.
 *
 * This extension provides Imin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Imin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Imin get() = object {
    /** Imin Crane 1 */
    val CRANE_1 = "spec:width=1200,height=1920,unit=px,dpi=220"

    /** Imin Falcon 1 */
    val FALCON_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Imin Falcon 2 */
    val FALCON_2 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Imin I24D02 */
    val I24D02 = "spec:width=1080,height=1920,unit=px,dpi=186"

    /** Imin iMinSwift1Pro */
    val IMINSWIFT1PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Imin iMinSwift2Pro */
    val IMINSWIFT2PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Imin Lark1 */
    val LARK1 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Imin Swan 1 Pro */
    val SWAN_1_PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

    /** Imin Swan1Pro */
    val SWAN1PRO = "spec:width=1080,height=1920,unit=px,dpi=220"

    /** Imin Swan2Printer */
    val SWAN2PRINTER = "spec:width=1080,height=1920,unit=px,dpi=220"

    /** Imin Swift 2 */
    val SWIFT_2 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Imin Swift 2 Pro */
    val SWIFT_2_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

}
