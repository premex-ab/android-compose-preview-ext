package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pcbox device specifications for Android Compose previews.
 *
 * This extension provides Pcbox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pcbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pcbox get() = object {
    /** Pcbox Curi_Lite_PCB-T103 */
    val CURI_LITE_PCB_T103 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pcbox Kova_PCB-T730 */
    val KOVA_PCB_T730 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pcbox PCB-T104 */
    val PCB_T104 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pcbox PCB-T105 */
    val PCB_T105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pcbox PCB-T106 */
    val PCB_T106 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Pcbox PCB-T732 */
    val PCB_T732 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Pcbox PCB_T801 */
    val PCB_T801 = "spec:width=800,height=1280,unit=px,dpi=180"

}
