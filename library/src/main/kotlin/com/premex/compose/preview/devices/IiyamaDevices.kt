package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iiyama device specifications for Android Compose previews.
 *
 * This extension provides Iiyama device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iiyama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iiyama get() = object {
    /** Iiyama TEXX13A */
    val TEXX13A = "spec:width=2160,height=3840,unit=px,dpi=480"

    /** Iiyama TEXX14MIS-B2AG */
    val TEXX14MIS_B2AG = "spec:width=2160,height=3840,unit=px,dpi=480"

}
