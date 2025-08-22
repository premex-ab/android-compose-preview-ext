package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pointofview device specifications for Android Compose previews.
 *
 * This extension provides Pointofview device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pointofview.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pointofview get() = object {
    /** Pointofview PVT-R78-3288 */
    val PVT_R78_3288 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Pointofview TAB-P10232-3G */
    val TAB_P10232_3G = "spec:width=800,height=1280,unit=px,dpi=213"

}
