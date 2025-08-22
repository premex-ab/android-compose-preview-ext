package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Coolfan device specifications for Android Compose previews.
 *
 * This extension provides Coolfan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Coolfan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Coolfan get() = object {
    /** Coolfan C107 */
    val C107 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Coolfan OC106 */
    val OC106 = "spec:width=800,height=1280,unit=px,dpi=160"

}
