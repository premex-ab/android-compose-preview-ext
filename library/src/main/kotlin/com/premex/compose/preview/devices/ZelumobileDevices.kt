package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zelumobile device specifications for Android Compose previews.
 *
 * This extension provides Zelumobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zelumobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zelumobile get() = object {
    /** Zelumobile C400 */
    val C400 = "spec:width=480,height=800,unit=px,dpi=240"

}
