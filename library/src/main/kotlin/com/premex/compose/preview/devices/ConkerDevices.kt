package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Conker device specifications for Android Compose previews.
 *
 * This extension provides Conker device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Conker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Conker get() = object {
    /** Conker ST60 */
    val ST60 = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Conker SX50 */
    val SX50 = "spec:width=720,height=1280,unit=px,dpi=320"

}
