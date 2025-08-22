package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Enacom device specifications for Android Compose previews.
 *
 * This extension provides Enacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Enacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Enacom get() = object {
    /** Enacom PIXBA2019 */
    val PIXBA2019 = "spec:width=800,height=1280,unit=px,dpi=213"

}
