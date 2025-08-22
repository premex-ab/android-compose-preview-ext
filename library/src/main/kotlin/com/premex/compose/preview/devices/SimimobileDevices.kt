package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Simimobile device specifications for Android Compose previews.
 *
 * This extension provides Simimobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Simimobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Simimobile get() = object {
    /** Simimobile Mecha */
    val MECHA = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Simimobile S501plus */
    val S501PLUS = "spec:width=540,height=960,unit=px,dpi=220"

    /** Simimobile S502 */
    val S502 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Simimobile S507 */
    val S507 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Simimobile S630 */
    val S630 = "spec:width=1080,height=2340,unit=px,dpi=480"

    /** Simimobile S8001 */
    val S8001 = "spec:width=800,height=1280,unit=px,dpi=213"

}
