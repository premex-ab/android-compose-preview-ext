package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Telma device specifications for Android Compose previews.
 *
 * This extension provides Telma device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Telma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Telma get() = object {
    /** Telma IFEEL MAX */
    val IFEEL_MAX = "spec:width=480,height=854,unit=px,dpi=240"

    /** Telma IFeel_Max_4G */
    val IFEEL_MAX_4G = "spec:width=480,height=854,unit=px,dpi=212"

    /** Telma S_Max */
    val S_MAX = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Telma Telma_F1_Max_4G */
    val TELMA_F1_MAX_4G = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Telma Telma_F1Prime4G */
    val TELMA_F1PRIME4G = "spec:width=720,height=1520,unit=px,dpi=300"

    /** Telma Telma F1XS4G  */
    val TELMA_F1XS4G = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Telma Telma_S_Prime */
    val TELMA_S_PRIME = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Telma TITAN */
    val TITAN = "spec:width=720,height=1280,unit=px,dpi=320"

}
