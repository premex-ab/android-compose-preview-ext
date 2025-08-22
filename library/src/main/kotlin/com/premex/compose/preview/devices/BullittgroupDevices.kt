package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Bullittgroup device specifications for Android Compose previews.
 *
 * This extension provides Bullittgroup device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Bullittgroup.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Bullittgroup get() = object {
    /** Bullittgroup Cat S60 */
    val CAT_S60 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Bullittgroup S30 */
    val S30 = "spec:width=480,height=854,unit=px,dpi=240"

}
