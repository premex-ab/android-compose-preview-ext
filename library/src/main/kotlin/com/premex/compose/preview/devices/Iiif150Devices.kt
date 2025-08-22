package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iiif150 device specifications for Android Compose previews.
 *
 * This extension provides Iiif150 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iiif150.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iiif150 get() = object {
    /** Iiif150 Air1 */
    val AIR1 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Iiif150 Air1 Pro */
    val AIR1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Iiif150 Air1 Ultra */
    val AIR1_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Iiif150 Air3_EEA */
    val AIR3_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Iiif150 Air3S */
    val AIR3S = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Iiif150 B1 */
    val B1 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Iiif150 B1 Pro */
    val B1_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Iiif150 B2 */
    val B2 = "spec:width=1080,height=2400,unit=px,dpi=480"

    /** Iiif150 B2 Pro */
    val B2_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Iiif150 B2 Ultra */
    val B2_ULTRA = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Iiif150 B3C */
    val B3C = "spec:width=720,height=1612,unit=px,dpi=280"

    /** Iiif150 B3_EEA */
    val B3_EEA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Iiif150 Raptor LTD */
    val RAPTOR_LTD = "spec:width=1080,height=2460,unit=px,dpi=480"

}
