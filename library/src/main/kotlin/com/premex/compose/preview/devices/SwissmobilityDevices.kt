package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Swissmobility device specifications for Android Compose previews.
 *
 * This extension provides Swissmobility device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Swissmobility.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Swissmobility get() = object {
    /** Swissmobility B4 */
    val B4 = "spec:width=720,height=1512,unit=px,dpi=320"

    /** Swissmobility Z7 */
    val Z7 = "spec:width=600,height=1024,unit=px,dpi=160"

}
