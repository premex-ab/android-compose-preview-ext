package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Moxnice device specifications for Android Compose previews.
 *
 * This extension provides Moxnice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Moxnice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Moxnice get() = object {
    /** Moxnice P50-EEA */
    val P50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Moxnice P50-ROW */
    val P50_ROW = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Moxnice P63_EEA */
    val P63_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

}
