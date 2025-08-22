package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Antempe device specifications for Android Compose previews.
 *
 * This extension provides Antempe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Antempe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Antempe get() = object {
    /** Antempe D115_EEA */
    val D115_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
