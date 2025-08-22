package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ikall device specifications for Android Compose previews.
 *
 * This extension provides Ikall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ikall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ikall get() = object {
    /** Ikall IKALL */
    val IKALL = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Ikall K510 */
    val K510 = "spec:width=480,height=854,unit=px,dpi=200"

    /** Ikall S3 */
    val S3 = "spec:width=1080,height=2460,unit=px,dpi=400"

    /** Ikall Z19 */
    val Z19 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Ikall Z20 */
    val Z20 = "spec:width=720,height=1640,unit=px,dpi=320"

}
