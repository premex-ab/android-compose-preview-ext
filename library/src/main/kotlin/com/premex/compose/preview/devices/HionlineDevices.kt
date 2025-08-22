package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hionline device specifications for Android Compose previews.
 *
 * This extension provides Hionline device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hionline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hionline get() = object {
    /** Hionline Boost Ultra */
    val BOOST_ULTRA = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Hionline HMR5450 */
    val HMR5450 = "spec:width=480,height=960,unit=px,dpi=240"

}
