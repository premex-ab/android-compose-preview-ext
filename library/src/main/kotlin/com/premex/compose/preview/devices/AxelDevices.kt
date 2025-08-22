package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Axel device specifications for Android Compose previews.
 *
 * This extension provides Axel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Axel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Axel get() = object {
    /** Axel AX_PRO */
    val AX_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

}
