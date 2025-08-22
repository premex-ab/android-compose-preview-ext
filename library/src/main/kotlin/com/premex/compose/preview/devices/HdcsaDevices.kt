package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hdcsa device specifications for Android Compose previews.
 *
 * This extension provides Hdcsa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hdcsa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hdcsa get() = object {
    /** Hdcsa H10_ONE */
    val H10_ONE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hdcsa H7_ONE */
    val H7_ONE = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Hdcsa T10_232 */
    val T10_232 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hdcsa T10I-4128 */
    val T10I_4128 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Hdcsa T7I_232 */
    val T7I_232 = "spec:width=600,height=1024,unit=px,dpi=160"

}
