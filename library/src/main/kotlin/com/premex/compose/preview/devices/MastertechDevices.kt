package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mastertech device specifications for Android Compose previews.
 *
 * This extension provides Mastertech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mastertech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mastertech get() = object {
    /** Mastertech 77-EV */
    val _77_EV = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Mastertech M2M-3T */
    val M2M_3T = "spec:width=600,height=1024,unit=px,dpi=213"

}
