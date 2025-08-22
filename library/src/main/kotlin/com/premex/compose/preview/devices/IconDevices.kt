package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Icon device specifications for Android Compose previews.
 *
 * This extension provides Icon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Icon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Icon get() = object {
    /** Icon Portal_10i */
    val PORTAL_10I = "spec:width=800,height=1280,unit=px,dpi=160"

}
