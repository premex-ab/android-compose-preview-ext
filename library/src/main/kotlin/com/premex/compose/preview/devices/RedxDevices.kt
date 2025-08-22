package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Redx device specifications for Android Compose previews.
 *
 * This extension provides Redx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Redx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Redx get() = object {
    /** Redx RX4505 */
    val RX4505 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Redx RX4559 */
    val RX4559 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Redx RX4618 */
    val RX4618 = "spec:width=480,height=996,unit=px,dpi=240"

    /** Redx RX4802 */
    val RX4802 = "spec:width=800,height=1280,unit=px,dpi=213"

}
