package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zoom device specifications for Android Compose previews.
 *
 * This extension provides Zoom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zoom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zoom get() = object {
    /** Zoom  ULTRA */
    val ULTRA = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Zoom ULTRA_Plus */
    val ULTRA_PLUS = "spec:width=600,height=1024,unit=px,dpi=220"

}
