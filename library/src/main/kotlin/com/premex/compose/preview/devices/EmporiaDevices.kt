package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Emporia device specifications for Android Compose previews.
 *
 * This extension provides Emporia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Emporia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Emporia get() = object {
    /** Emporia E5mini */
    val E5MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Emporia E6_EEA */
    val E6_EEA = "spec:width=1080,height=2408,unit=px,dpi=480"

    /** Emporia E6mini */
    val E6MINI = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Emporia Emporia SMART 3 */
    val EMPORIA_SMART_3 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Emporia emporiaSMART.7lite */
    val EMPORIASMART_7LITE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Emporia S3mini */
    val S3MINI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Emporia S4i */
    val S4I = "spec:width=480,height=960,unit=px,dpi=240"

    /** Emporia S5_EEA */
    val S5_EEA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Emporia SEi */
    val SEI = "spec:width=480,height=960,unit=px,dpi=240"

    /** Emporia TAB1 */
    val TAB1 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
