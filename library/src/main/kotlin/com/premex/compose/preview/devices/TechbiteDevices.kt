package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Techbite device specifications for Android Compose previews.
 *
 * This extension provides Techbite device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Techbite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Techbite get() = object {
    /** Techbite SmartBoard 10 LTE */
    val SMARTBOARD_10_LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Techbite smartboard_2 */
    val SMARTBOARD_2 = "spec:width=1200,height=1920,unit=px,dpi=286"

}
