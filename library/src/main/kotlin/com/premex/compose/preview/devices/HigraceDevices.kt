package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Higrace device specifications for Android Compose previews.
 *
 * This extension provides Higrace device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Higrace.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Higrace get() = object {
    /** Higrace G15_EEA */
    val G15_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Higrace OC101 */
    val OC101 = "spec:width=800,height=1280,unit=px,dpi=160"

}
