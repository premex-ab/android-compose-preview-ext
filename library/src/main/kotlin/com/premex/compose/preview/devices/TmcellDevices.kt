package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tmcell device specifications for Android Compose previews.
 *
 * This extension provides Tmcell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tmcell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tmcell get() = object {
    /** Tmcell ISWAG KRONOS  */
    val ISWAG_KRONOS = "spec:width=480,height=960,unit=px,dpi=240"

    /** Tmcell LOGIC X50  */
    val LOGIC_X50 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Tmcell LOGIC_X60_PLUS */
    val LOGIC_X60_PLUS = "spec:width=600,height=1280,unit=px,dpi=240"

    /** Tmcell UNONU W50  */
    val UNONU_W50 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Tmcell UNONU_W60_PLUSt */
    val UNONU_W60_PLUST = "spec:width=600,height=1280,unit=px,dpi=240"

}
