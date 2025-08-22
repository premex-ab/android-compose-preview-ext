package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aratek device specifications for Android Compose previews.
 *
 * This extension provides Aratek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aratek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aratek get() = object {
    /** Aratek Marshall-8 */
    val MARSHALL_8 = "spec:width=800,height=1280,unit=px,dpi=160"

}
