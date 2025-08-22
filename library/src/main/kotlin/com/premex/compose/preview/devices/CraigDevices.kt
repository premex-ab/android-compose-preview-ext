package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Craig device specifications for Android Compose previews.
 *
 * This extension provides Craig device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Craig.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Craig get() = object {
    /** Craig CMP846 */
    val CMP846 = "spec:width=800,height=1280,unit=px,dpi=160"

}
