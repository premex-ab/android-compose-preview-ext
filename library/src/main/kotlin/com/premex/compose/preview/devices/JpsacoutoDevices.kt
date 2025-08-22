package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jpsacouto device specifications for Android Compose previews.
 *
 * This extension provides Jpsacouto device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jpsacouto.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jpsacouto get() = object {
    /** Jpsacouto Verdite Hill */
    val VERDITE_HILL = "spec:width=800,height=1280,unit=px,dpi=160"

}
