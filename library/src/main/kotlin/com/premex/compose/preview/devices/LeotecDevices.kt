package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Leotec device specifications for Android Compose previews.
 *
 * This extension provides Leotec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Leotec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Leotec get() = object {
    /** Leotec mid1016_mk_64 */
    val MID1016_MK_64 = "spec:width=800,height=1280,unit=px,dpi=160"

}
