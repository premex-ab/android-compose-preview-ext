package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Portfolio device specifications for Android Compose previews.
 *
 * This extension provides Portfolio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Portfolio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Portfolio get() = object {
    /** Portfolio P9001 */
    val P9001 = "spec:width=800,height=1280,unit=px,dpi=160"

}
