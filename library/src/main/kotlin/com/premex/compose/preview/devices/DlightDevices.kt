package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Dlight device specifications for Android Compose previews.
 *
 * This extension provides Dlight device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Dlight.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Dlight get() = object {
    /** Dlight M100 */
    val M100 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Dlight M1000 */
    val M1000 = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Dlight M200A */
    val M200A = "spec:width=480,height=854,unit=px,dpi=240"

}
