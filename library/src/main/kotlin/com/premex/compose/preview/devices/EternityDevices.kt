package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Eternity device specifications for Android Compose previews.
 *
 * This extension provides Eternity device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Eternity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Eternity get() = object {
    /** Eternity HEROSP001 */
    val HEROSP001 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Eternity ZEUSs68 */
    val ZEUSS68 = "spec:width=720,height=1600,unit=px,dpi=320"

}
