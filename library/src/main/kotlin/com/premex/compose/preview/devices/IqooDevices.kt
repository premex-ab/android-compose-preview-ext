package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqoo device specifications for Android Compose previews.
 *
 * This extension provides Iqoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqoo get() = object {
    /** Iqoo iQOO Neo 10 */
    val IQOO_NEO_10 = "spec:width=1260,height=2800,unit=px,dpi=480"

    /** Iqoo  iQOO Pad5 */
    val IQOO_PAD5 = "spec:width=1968,height=2800,unit=px,dpi=400"

    /** Iqoo iQOO Z10 Lite 5G */
    val IQOO_Z10_LITE_5G = "spec:width=720,height=1600,unit=px,dpi=300"

    /** Iqoo Neo10 Pro+ */
    val NEO10_PRO = "spec:width=1440,height=3168,unit=px,dpi=480"

    /** Iqoo Pad5 Pro */
    val PAD5_PRO = "spec:width=2064,height=3096,unit=px,dpi=400"

}
