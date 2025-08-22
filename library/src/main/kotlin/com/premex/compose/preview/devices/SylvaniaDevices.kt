package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sylvania device specifications for Android Compose previews.
 *
 * This extension provides Sylvania device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sylvania.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sylvania get() = object {
    /** Sylvania SLTDVD1024 */
    val SLTDVD1024 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Sylvania SLTDVD1024_B */
    val SLTDVD1024_B = "spec:width=600,height=1024,unit=px,dpi=160"

}
