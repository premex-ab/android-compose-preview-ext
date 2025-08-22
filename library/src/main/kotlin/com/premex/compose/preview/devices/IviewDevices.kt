package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iview device specifications for Android Compose previews.
 *
 * This extension provides Iview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iview get() = object {
    /** Iview 1016TPC */
    val _1016TPC = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iview 816TPC */
    val _816TPC = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iview IVIEW */
    val IVIEW = "spec:width=800,height=1280,unit=px,dpi=160"

}
