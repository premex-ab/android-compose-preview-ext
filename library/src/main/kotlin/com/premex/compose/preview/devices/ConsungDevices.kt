package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Consung device specifications for Android Compose previews.
 *
 * This extension provides Consung device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Consung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Consung get() = object {
    /** Consung CS10L_PRO */
    val CS10L_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Consung N101B */
    val N101B = "spec:width=800,height=1280,unit=px,dpi=160"

}
