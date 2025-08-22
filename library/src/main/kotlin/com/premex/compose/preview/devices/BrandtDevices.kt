package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Brandt device specifications for Android Compose previews.
 *
 * This extension provides Brandt device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Brandt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Brandt get() = object {
    /** Brandt B-ONE */
    val B_ONE = "spec:width=720,height=1500,unit=px,dpi=320"

    /** Brandt BPRIME */
    val BPRIME = "spec:width=720,height=1498,unit=px,dpi=320"

    /** Brandt BPRIMES */
    val BPRIMES = "spec:width=1080,height=2160,unit=px,dpi=480"

    /** Brandt BSTAR */
    val BSTAR = "spec:width=480,height=960,unit=px,dpi=240"

    /** Brandt BSTAR+ */
    val BSTAR_720X1440 = "spec:width=720,height=1440,unit=px,dpi=320"

}
