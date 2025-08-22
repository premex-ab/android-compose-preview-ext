package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Idc device specifications for Android Compose previews.
 *
 * This extension provides Idc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Idc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Idc get() = object {
    /** Idc EVO_G4 */
    val EVO_G4 = "spec:width=1080,height=2340,unit=px,dpi=480"

}
