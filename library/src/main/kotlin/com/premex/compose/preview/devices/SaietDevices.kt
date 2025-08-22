package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Saiet device specifications for Android Compose previews.
 *
 * This extension provides Saiet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Saiet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Saiet get() = object {
    /** Saiet STS502 */
    val STS502 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Saiet STS550 */
    val STS550 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Saiet STS570 */
    val STS570 = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Saiet STS571 */
    val STS571 = "spec:width=720,height=1612,unit=px,dpi=320"

    /** Saiet STS600 */
    val STS600 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Saiet STS601 */
    val STS601 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Saiet STS602 */
    val STS602 = "spec:width=720,height=1560,unit=px,dpi=320"

}
