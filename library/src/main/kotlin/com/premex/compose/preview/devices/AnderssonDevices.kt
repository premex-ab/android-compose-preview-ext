package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Andersson device specifications for Android Compose previews.
 *
 * This extension provides Andersson device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Andersson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Andersson get() = object {
    /** Andersson tablet */
    val TABLET = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Andersson TBX10 */
    val TBX10 = "spec:width=1200,height=1920,unit=px,dpi=280"

    /** Andersson TBX11 */
    val TBX11 = "spec:width=1200,height=1920,unit=px,dpi=320"

}
