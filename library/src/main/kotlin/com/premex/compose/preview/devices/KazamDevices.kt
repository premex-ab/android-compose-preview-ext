package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kazam device specifications for Android Compose previews.
 *
 * This extension provides Kazam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kazam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kazam get() = object {
    /** Kazam Tornado 348 */
    val TORNADO_348 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kazam Trooper 650 4G */
    val TROOPER_650_4G = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Kazam TROOPER X3.5 */
    val TROOPER_X3_5 = "spec:width=480,height=854,unit=px,dpi=240"

}
