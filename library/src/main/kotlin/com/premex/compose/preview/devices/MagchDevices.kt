package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Magch device specifications for Android Compose previews.
 *
 * This extension provides Magch device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Magch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Magch get() = object {
    /** Magch M210 */
    val M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Magch M321 */
    val M321 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Magch M321-EEA */
    val M321_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Magch M610 */
    val M610 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Magch M610-EEA */
    val M610_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Magch M820 */
    val M820 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Magch M820-EEA */
    val M820_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Magch M821 */
    val M821 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Magch M821-EEA */
    val M821_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Magch T7 */
    val T7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
