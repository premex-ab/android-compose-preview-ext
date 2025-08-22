package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * H819e device specifications for Android Compose previews.
 *
 * This extension provides H819e device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.H819e.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.H819e get() = object {
    /** H819e MINTAKA */
    val MINTAKA = "spec:width=800,height=1280,unit=px,dpi=160"

}
