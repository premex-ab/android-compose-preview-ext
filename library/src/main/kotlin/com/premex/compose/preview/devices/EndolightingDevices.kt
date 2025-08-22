package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Endolighting device specifications for Android Compose previews.
 *
 * This extension provides Endolighting device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Endolighting.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Endolighting get() = object {
    /** Endolighting FX438NA */
    val FX438NA = "spec:width=600,height=1024,unit=px,dpi=160"

}
