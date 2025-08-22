package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Exertis device specifications for Android Compose previews.
 *
 * This extension provides Exertis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Exertis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Exertis get() = object {
    /** Exertis SMB-H8009 */
    val SMB_H8009 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
