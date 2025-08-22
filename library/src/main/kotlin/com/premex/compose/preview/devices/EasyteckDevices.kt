package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Easyteck device specifications for Android Compose previews.
 *
 * This extension provides Easyteck device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Easyteck.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Easyteck get() = object {
    /** Easyteck EK10 */
    val EK10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Easyteck  EK12  */
    val EK12 = "spec:width=1200,height=2000,unit=px,dpi=240"

}
