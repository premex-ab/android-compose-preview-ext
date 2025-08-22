package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lyotechlabs device specifications for Android Compose previews.
 *
 * This extension provides Lyotechlabs device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lyotechlabs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lyotechlabs get() = object {
    /** Lyotechlabs LFi_ONE_EEA */
    val LFI_ONE_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

}
