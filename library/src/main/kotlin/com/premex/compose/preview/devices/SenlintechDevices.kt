package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Senlintech device specifications for Android Compose previews.
 *
 * This extension provides Senlintech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Senlintech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Senlintech get() = object {
    /** Senlintech pad6_EEA */
    val PAD6_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Senlintech S30-Pro */
    val S30_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

}
