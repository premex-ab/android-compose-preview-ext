package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sarlwisetechnologie device specifications for Android Compose previews.
 *
 * This extension provides Sarlwisetechnologie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sarlwisetechnologie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sarlwisetechnologie get() = object {
    /** Sarlwisetechnologie P1_Plus */
    val P1_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

    /** Sarlwisetechnologie Wise_Tab */
    val WISE_TAB = "spec:width=600,height=1024,unit=px,dpi=160"

}
