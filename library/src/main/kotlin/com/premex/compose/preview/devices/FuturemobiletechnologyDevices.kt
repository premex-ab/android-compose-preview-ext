package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Futuremobiletechnology device specifications for Android Compose previews.
 *
 * This extension provides Futuremobiletechnology device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Futuremobiletechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Futuremobiletechnology get() = object {
    /** Futuremobiletechnology CP80K */
    val CP80K = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Futuremobiletechnology Global3_B01 */
    val GLOBAL3_B01 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
