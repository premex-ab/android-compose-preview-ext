package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * _11 device specifications for Android Compose previews.
 *
 * This extension provides _11 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices._11.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices._11 get() = object {
    /** _11 AEOP525 */
    val AEOP525 = "spec:width=720,height=1640,unit=px,dpi=320"

}
