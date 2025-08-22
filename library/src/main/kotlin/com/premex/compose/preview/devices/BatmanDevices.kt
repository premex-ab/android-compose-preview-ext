package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Batman device specifications for Android Compose previews.
 *
 * This extension provides Batman device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Batman.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Batman get() = object {
    /** Batman TM-MID1065BT */
    val TM_MID1065BT = "spec:width=800,height=1280,unit=px,dpi=160"

}
