package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Trecfone device specifications for Android Compose previews.
 *
 * This extension provides Trecfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Trecfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Trecfone get() = object {
    /** Trecfone 17 Pro Max */
    val _17_PRO_MAX = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Trecfone T20 */
    val T20 = "spec:width=1080,height=2460,unit=px,dpi=480"

    /** Trecfone Trecfone_16 Pro Max */
    val TRECFONE_16_PRO_MAX = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Trecfone V35 */
    val V35 = "spec:width=720,height=1600,unit=px,dpi=480"

}
