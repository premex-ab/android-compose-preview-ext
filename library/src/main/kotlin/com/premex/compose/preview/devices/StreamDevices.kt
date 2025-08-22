package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Stream device specifications for Android Compose previews.
 *
 * This extension provides Stream device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Stream.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Stream get() = object {
    /** Stream B1s */
    val B1S = "spec:width=480,height=800,unit=px,dpi=240"

    /** Stream B3Pro */
    val B3PRO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Stream Everest */
    val EVEREST = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Stream HT16 */
    val HT16 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Stream HT28 */
    val HT28 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Stream S7 */
    val S7 = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Stream SHARK */
    val SHARK = "spec:width=1080,height=1920,unit=px,dpi=480"

}
