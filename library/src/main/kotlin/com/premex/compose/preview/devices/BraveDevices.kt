package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Brave device specifications for Android Compose previews.
 *
 * This extension provides Brave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Brave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Brave get() = object {
    /** Brave BT7X1 */
    val BT7X1 = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Brave BT8X1 */
    val BT8X1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Brave BTSL1 */
    val BTSL1 = "spec:width=1200,height=1920,unit=px,dpi=320"

    /** Brave BTXS1 */
    val BTXS1 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Brave EX10SL4 */
    val EX10SL4 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Brave T2lite */
    val T2LITE = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Brave T2Max */
    val T2MAX = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Brave T2Pro */
    val T2PRO = "spec:width=800,height=1280,unit=px,dpi=160"

}
