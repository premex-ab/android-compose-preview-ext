package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Proscan device specifications for Android Compose previews.
 *
 * This extension provides Proscan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Proscan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Proscan get() = object {
    /** Proscan PELTDV1029 */
    val PELTDV1029 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Proscan PLT7774G */
    val PLT7774G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Proscan PLT7775G */
    val PLT7775G = "spec:width=600,height=1024,unit=px,dpi=160"

}
