package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Pixpeak device specifications for Android Compose previews.
 *
 * This extension provides Pixpeak device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Pixpeak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Pixpeak get() = object {
    /** Pixpeak L60-EEA */
    val L60_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

    /** Pixpeak M258-EEA */
    val M258_EEA = "spec:width=1200,height=1920,unit=px,dpi=213"

    /** Pixpeak P107-EEA */
    val P107_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Pixpeak Tablet */
    val TABLET = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Pixpeak U921 */
    val U921 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Pixpeak U921-EEA */
    val U921_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

}
