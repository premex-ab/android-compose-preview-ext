package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ctroniq device specifications for Android Compose previews.
 *
 * This extension provides Ctroniq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ctroniq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ctroniq get() = object {
    /** Ctroniq CTRONIQ-SNOOK-X10 */
    val CTRONIQ_SNOOK_X10 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ctroniq CTRONIQ-SNOOK-X10L */
    val CTRONIQ_SNOOK_X10L = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ctroniq SNOOK-X10 */
    val SNOOK_X10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ctroniq  SNOOK-X10  */
    val SNOOK_X10_800X1280 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ctroniq SNOOK-X75  */
    val SNOOK_X75 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ctroniq SNOOK-X80 */
    val SNOOK_X80 = "spec:width=800,height=1280,unit=px,dpi=213"

}
