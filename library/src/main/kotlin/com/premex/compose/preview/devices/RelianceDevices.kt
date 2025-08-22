package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Reliance device specifications for Android Compose previews.
 *
 * This extension provides Reliance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Reliance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Reliance get() = object {
    /** Reliance FL7008 */
    val FL7008 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Reliance LS-4008 */
    val LS_4008 = "spec:width=480,height=800,unit=px,dpi=240"

    /** Reliance LS-5506 */
    val LS_5506 = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** Reliance LS-5512 */
    val LS_5512 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Reliance RC500L */
    val RC500L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Reliance RC501L */
    val RC501L = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Reliance  Smartphone JS LS-5010 */
    val SMARTPHONE_JS_LS_5010 = "spec:width=720,height=1280,unit=px,dpi=320"

}
