package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Unitel device specifications for Android Compose previews.
 *
 * This extension provides Unitel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Unitel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Unitel get() = object {
    /** Unitel U903 */
    val U903 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Unitel UNITEL_TAB_4G_H101 */
    val UNITEL_TAB_4G_H101 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Unitel USMART6 */
    val USMART6 = "spec:width=720,height=1612,unit=px,dpi=320"

}
