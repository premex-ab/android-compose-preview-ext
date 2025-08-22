package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ibuddie device specifications for Android Compose previews.
 *
 * This extension provides Ibuddie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ibuddie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ibuddie get() = object {
    /** Ibuddie TG08RK */
    val TG08RK = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Ibuddie TG08RK1 */
    val TG08RK1 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ibuddie TU10MK1_1 */
    val TU10MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ibuddie TU11MK1_1 */
    val TU11MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Ibuddie TU11MK1_2 */
    val TU11MK1_2 = "spec:width=800,height=1280,unit=px,dpi=160"

}
