package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Nwnorwin device specifications for Android Compose previews.
 *
 * This extension provides Nwnorwin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Nwnorwin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Nwnorwin get() = object {
    /** Nwnorwin NW1 */
    val NW1 = "spec:width=600,height=1024,unit=px,dpi=160"

}
