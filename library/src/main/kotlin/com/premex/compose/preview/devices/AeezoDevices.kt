package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Aeezo device specifications for Android Compose previews.
 *
 * This extension provides Aeezo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Aeezo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Aeezo get() = object {
    /** Aeezo TK701 */
    val TK701 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Aeezo TK701_EEA */
    val TK701_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aeezo TK801 */
    val TK801 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aeezo TK806 */
    val TK806 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aeezo TK806_EEA  */
    val TK806_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aeezo TK809 */
    val TK809 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aeezo TK809_EEA */
    val TK809_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Aeezo TP1001 */
    val TP1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Aeezo TP901 */
    val TP901 = "spec:width=800,height=1280,unit=px,dpi=213"

}
