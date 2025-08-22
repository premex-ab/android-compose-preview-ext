package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Redmobile device specifications for Android Compose previews.
 *
 * This extension provides Redmobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Redmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Redmobile get() = object {
    /** Redmobile Quick_5_0 */
    val QUICK_5_0 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Redmobile Volt L */
    val VOLT_L = "spec:width=480,height=960,unit=px,dpi=240"

}
