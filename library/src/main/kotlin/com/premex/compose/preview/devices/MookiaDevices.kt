package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mookia device specifications for Android Compose previews.
 *
 * This extension provides Mookia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mookia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mookia get() = object {
    /** Mookia FF-P30 */
    val FF_P30 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mookia M10A */
    val M10A = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Mookia MM10A */
    val MM10A = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mookia MM-35 */
    val MM_35 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Mookia MM-35_EEA */
    val MM_35_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
