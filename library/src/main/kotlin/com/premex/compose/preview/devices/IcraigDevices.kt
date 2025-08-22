package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Icraig device specifications for Android Compose previews.
 *
 * This extension provides Icraig device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Icraig.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Icraig get() = object {
    /** Icraig CMP838 */
    val CMP838 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Icraig CMP840 */
    val CMP840 = "spec:width=600,height=1024,unit=px,dpi=160"

}
