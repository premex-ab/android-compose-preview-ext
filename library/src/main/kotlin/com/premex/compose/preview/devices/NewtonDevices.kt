package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Newton device specifications for Android Compose previews.
 *
 * This extension provides Newton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Newton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Newton get() = object {
    /** Newton H1 */
    val H1 = "spec:width=800,height=1280,unit=px,dpi=213"

}
