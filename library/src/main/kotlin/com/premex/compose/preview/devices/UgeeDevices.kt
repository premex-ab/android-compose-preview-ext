package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ugee device specifications for Android Compose previews.
 *
 * This extension provides Ugee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ugee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ugee get() = object {
    /** Ugee UT1Lite_NOEEA */
    val UT1LITE_NOEEA = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Ugee UT2 */
    val UT2 = "spec:width=1200,height=2000,unit=px,dpi=240"

    /** Ugee UT3 Drawing Pad */
    val UT3_DRAWING_PAD = "spec:width=1600,height=2400,unit=px,dpi=320"

}
