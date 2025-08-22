package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Fivahiva device specifications for Android Compose previews.
 *
 * This extension provides Fivahiva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Fivahiva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Fivahiva get() = object {
    /** Fivahiva F10A */
    val F10A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fivahiva F-764 */
    val F_764 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fivahiva FF1010 */
    val FF1010 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Fivahiva FF10A */
    val FF10A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fivahiva FF-35 */
    val FF_35 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fivahiva MM-P30 */
    val MM_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Fivahiva YY_766 */
    val YY_766 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Fivahiva YY_766_EEA */
    val YY_766_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

}
