package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Idemia device specifications for Android Compose previews.
 *
 * This extension provides Idemia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Idemia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Idemia get() = object {
    /** Idemia ID Screen */
    val ID_SCREEN = "spec:width=800,height=1280,unit=px,dpi=213"

}
