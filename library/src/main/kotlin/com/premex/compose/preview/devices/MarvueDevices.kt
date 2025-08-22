package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Marvue device specifications for Android Compose previews.
 *
 * This extension provides Marvue device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Marvue.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Marvue get() = object {
    /** Marvue M11 */
    val M11 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Marvue M12 */
    val M12 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Marvue M15 */
    val M15 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Marvue M8 */
    val M8 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Marvue M81 */
    val M81 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Marvue M8_Pro */
    val M8_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Marvue Pad_M10 */
    val PAD_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
