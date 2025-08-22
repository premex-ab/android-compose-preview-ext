package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Maxis device specifications for Android Compose previews.
 *
 * This extension provides Maxis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Maxis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Maxis get() = object {
    /** Maxis NeXT X1 */
    val NEXT_X1 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
