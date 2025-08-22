package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * _10or device specifications for Android Compose previews.
 *
 * This extension provides _10or device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices._10or.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices._10or get() = object {
    /** _10or 10or_G2 */
    val _10OR_G2 = "spec:width=1080,height=2246,unit=px,dpi=480"

    /** _10or D */
    val D = "spec:width=720,height=1280,unit=px,dpi=320"

    /** _10or E */
    val E = "spec:width=1080,height=1920,unit=px,dpi=480"

    /** _10or G */
    val G = "spec:width=1080,height=1920,unit=px,dpi=480"

}
