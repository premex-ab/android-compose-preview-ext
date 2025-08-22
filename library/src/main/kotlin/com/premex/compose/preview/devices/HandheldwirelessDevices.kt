package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Handheldwireless device specifications for Android Compose previews.
 *
 * This extension provides Handheldwireless device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Handheldwireless.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Handheldwireless get() = object {
    /** Handheldwireless C6 */
    val C6 = "spec:width=720,height=1440,unit=px,dpi=280"

    /** Handheldwireless X6 */
    val X6 = "spec:width=720,height=1440,unit=px,dpi=280"

}
