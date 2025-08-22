package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ysfen device specifications for Android Compose previews.
 *
 * This extension provides Ysfen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ysfen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ysfen get() = object {
    /** Ysfen B9000 */
    val B9000 = "spec:width=1080,height=1920,unit=px,dpi=480"

}
