package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Billow device specifications for Android Compose previews.
 *
 * This extension provides Billow device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Billow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Billow get() = object {
    /** Billow X101PRO+ */
    val X101PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Billow X103PRO */
    val X103PRO = "spec:width=800,height=1280,unit=px,dpi=160"

}
