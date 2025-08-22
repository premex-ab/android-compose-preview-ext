package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Beista device specifications for Android Compose previews.
 *
 * This extension provides Beista device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Beista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Beista get() = object {
    /** Beista K105 */
    val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beista T30 */
    val T30 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beista X101 */
    val X101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Beista X104 */
    val X104 = "spec:width=1200,height=1920,unit=px,dpi=260"

    /** Beista X104-EEA */
    val X104_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Beista X80-EEA */
    val X80_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

}
