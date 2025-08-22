package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cellecor device specifications for Android Compose previews.
 *
 * This extension provides Cellecor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cellecor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cellecor get() = object {
    /** Cellecor S2 */
    val S2 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Cellecor S3pro */
    val S3PRO = "spec:width=720,height=1600,unit=px,dpi=320"

}
