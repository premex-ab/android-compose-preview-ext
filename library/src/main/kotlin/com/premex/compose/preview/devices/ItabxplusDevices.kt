package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Itabxplus device specifications for Android Compose previews.
 *
 * This extension provides Itabxplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Itabxplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Itabxplus get() = object {
    /** Itabxplus iTAB-A1 */
    val ITAB_A1 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Itabxplus ITAB_X38T */
    val ITAB_X38T = "spec:width=1200,height=1920,unit=px,dpi=280"

}
