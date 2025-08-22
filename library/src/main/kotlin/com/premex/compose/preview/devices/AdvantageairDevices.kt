package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Advantageair device specifications for Android Compose previews.
 *
 * This extension provides Advantageair device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Advantageair.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Advantageair get() = object {
    /** Advantageair PIC10GS10 */
    val PIC10GS10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advantageair PIC10GS13 */
    val PIC10GS13 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Advantageair PIC10GS8 */
    val PIC10GS8 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advantageair PIC7GS10-A */
    val PIC7GS10_A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advantageair PIC7GS13 */
    val PIC7GS13 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advantageair PIC7GS8 */
    val PIC7GS8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Advantageair PIC8GS10 */
    val PIC8GS10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Advantageair PIC8GS12 */
    val PIC8GS12 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Advantageair PIC8GS8 */
    val PIC8GS8 = "spec:width=800,height=1280,unit=px,dpi=240"

}
