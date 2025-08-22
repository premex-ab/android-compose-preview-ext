package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dicletab device specifications for Android Compose previews.
 *
 * This extension provides Dicletab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dicletab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dicletab get() = object {
    /** Dicletab Dicle_Tab_Active */
    val DICLE_TAB_ACTIVE = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dicletab Dicle Tab Active S */
    val DICLE_TAB_ACTIVE_S = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dicletab Dicle Tab MyPen P1 */
    val DICLE_TAB_MYPEN_P1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Dicletab Dicle Tab U1008 */
    val DICLE_TAB_U1008 = "spec:width=1280,height=1920,unit=px,dpi=320"

    /** Dicletab Dicle Tab Ultra */
    val DICLE_TAB_ULTRA = "spec:width=1200,height=2000,unit=px,dpi=320"

}
