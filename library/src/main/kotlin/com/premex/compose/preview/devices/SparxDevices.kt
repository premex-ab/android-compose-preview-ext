package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sparx device specifications for Android Compose previews.
 *
 * This extension provides Sparx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sparx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sparx get() = object {
    /** Sparx Edge 20 Pro */
    val EDGE_20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Sparx Neo 11 */
    val NEO_11 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx NEO 5 */
    val NEO_5 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx Neo 5 Pro */
    val NEO_5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx NEO_6 */
    val NEO_6 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx Neo 7 Plus */
    val NEO_7_PLUS = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Sparx Neo 7 Ultra */
    val NEO_7_ULTRA = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx Neo 8 Lite */
    val NEO_8_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx NEO 9 */
    val NEO_9 = "spec:width=720,height=1612,unit=px,dpi=300"

    /** Sparx Neo_X */
    val NEO_X = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Sparx Note 12 */
    val NOTE_12 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Sparx Note_20 */
    val NOTE_20 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Sparx S3 */
    val S3 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Sparx S6 */
    val S6 = "spec:width=480,height=960,unit=px,dpi=200"

    /** Sparx S7 */
    val S7 = "spec:width=480,height=960,unit=px,dpi=220"

    /** Sparx S9 */
    val S9 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Sparx Sparx */
    val SPARX = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Sparx Sparx Neo 7 */
    val SPARX_NEO_7 = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sparx Sparx Neo 7 Pro */
    val SPARX_NEO_7_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sparx Sparx Neo 8 Pro */
    val SPARX_NEO_8_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sparx Sparx Neo 9i */
    val SPARX_NEO_9I = "spec:width=720,height=1600,unit=px,dpi=280"

    /** Sparx Sparx Ultra 8i */
    val SPARX_ULTRA_8I = "spec:width=720,height=1604,unit=px,dpi=320"

    /** Sparx Ultra 11 */
    val ULTRA_11 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Sparx Ultra 8 */
    val ULTRA_8 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Sparx Ultra 8 Pro */
    val ULTRA_8_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

}
