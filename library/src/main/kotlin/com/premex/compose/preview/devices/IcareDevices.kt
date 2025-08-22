package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Icare device specifications for Android Compose previews.
 *
 * This extension provides Icare device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Icare.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Icare get() = object {
    /** Icare iCare10 */
    val ICARE10 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
