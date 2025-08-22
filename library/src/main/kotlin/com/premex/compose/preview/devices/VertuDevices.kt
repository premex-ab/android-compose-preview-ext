package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vertu device specifications for Android Compose previews.
 *
 * This extension provides Vertu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vertu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vertu get() = object {
    /** Vertu ASTER  P */
    val ASTER_P = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertu Aster T */
    val ASTER_T = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertu Constellation V */
    val CONSTELLATION_V = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Vertu Constellation X */
    val CONSTELLATION_X = "spec:width=1440,height=2560,unit=px,dpi=640"

    /** Vertu METAFLIP */
    val METAFLIP = "spec:width=1188,height=2790,unit=px,dpi=520"

    /** Vertu METAVERTU 2 */
    val METAVERTU_2 = "spec:width=1260,height=2800,unit=px,dpi=560"

    /** Vertu Signature Touch */
    val SIGNATURE_TOUCH = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Vertu VTL-202101 */
    val VTL_202101 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Vertu VTL-202201 */
    val VTL_202201 = "spec:width=1080,height=2400,unit=px,dpi=480"

}
