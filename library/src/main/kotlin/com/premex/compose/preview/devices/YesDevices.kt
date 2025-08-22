package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Yes device specifications for Android Compose previews.
 *
 * This extension provides Yes device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Yes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Yes get() = object {
    /** Yes Altitude 3 */
    val ALTITUDE_3 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Yes Altitude 4 */
    val ALTITUDE_4 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Yes M631Y */
    val M631Y = "spec:width=720,height=1280,unit=px,dpi=320"

}
