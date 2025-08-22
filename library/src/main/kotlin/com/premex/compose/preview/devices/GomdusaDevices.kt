package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gomdusa device specifications for Android Compose previews.
 *
 * This extension provides Gomdusa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gomdusa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gomdusa get() = object {
    /** Gomdusa X23_Pro */
    val X23_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gomdusa X23_TAB */
    val X23_TAB = "spec:width=800,height=1280,unit=px,dpi=240"

}
