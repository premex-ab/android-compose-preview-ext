package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Denverelectronics device specifications for Android Compose previews.
 *
 * This extension provides Denverelectronics device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Denverelectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Denverelectronics get() = object {
    /** Denverelectronics SCQ-50001G */
    val SCQ_50001G = "spec:width=480,height=960,unit=px,dpi=240"

    /** Denverelectronics SDQ-55044L */
    val SDQ_55044L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Denverelectronics SDQ-57004L */
    val SDQ_57004L = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Denverelectronics TAQ-10 */
    val TAQ_10 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TAQ-102 */
    val TAQ_102 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TAQ-104A */
    val TAQ_104A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TAQ_10G */
    val TAQ_10G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TAQ70 */
    val TAQ70 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TAQ-703A */
    val TAQ_703A = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Denverelectronics TIQ-102 */
    val TIQ_102 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Denverelectronics TIQ-1044 */
    val TIQ_1044 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Denverelectronics TIQ_1048 */
    val TIQ_1048 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Denverelectronics TIQ-1049 */
    val TIQ_1049 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Denverelectronics TIQ-70 */
    val TIQ_70 = "spec:width=600,height=1024,unit=px,dpi=160"

}
