package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jeazans device specifications for Android Compose previews.
 *
 * This extension provides Jeazans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jeazans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jeazans get() = object {
    /** Jeazans A13 */
    val A13 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Jeazans KT1016_EEA */
    val KT1016_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
