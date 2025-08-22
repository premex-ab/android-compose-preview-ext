package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jcbuk device specifications for Android Compose previews.
 *
 * This extension provides Jcbuk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jcbuk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jcbuk get() = object {
    /** Jcbuk JCB_TP231 */
    val JCB_TP231 = "spec:width=720,height=1520,unit=px,dpi=320"

}
