package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zonko device specifications for Android Compose previews.
 *
 * This extension provides Zonko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zonko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zonko get() = object {
    /** Zonko D105 */
    val D105 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zonko D106 */
    val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Zonko D110 */
    val D110 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Zonko D115 */
    val D115 = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Zonko D118 */
    val D118 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Zonko K101 */
    val K101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zonko K101_EEA */
    val K101_EEA = "spec:width=1200,height=1920,unit=px,dpi=160"

    /** Zonko K105 */
    val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zonko K105_EEA */
    val K105_EEA = "spec:width=1440,height=2960,unit=px,dpi=560"

    /** Zonko K106 */
    val K106 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Zonko K110 */
    val K110 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zonko K113 */
    val K113 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zonko K116_M */
    val K116_M = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Zonko K118 */
    val K118 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Zonko K150 */
    val K150 = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Zonko K710 */
    val K710 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Zonko K711 */
    val K711 = "spec:width=600,height=1024,unit=px,dpi=160"

}
