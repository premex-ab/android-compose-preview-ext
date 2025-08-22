package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hihi device specifications for Android Compose previews.
 *
 * This extension provides Hihi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hihi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hihi get() = object {
    /** Hihi HIHI-40KH-TAB-01 */
    val HIHI_40KH_TAB_01 = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hihi HIHI-41KH-TAB-1-EEA */
    val HIHI_41KH_TAB_1_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Hihi HIHI-50KH-TAB-01-EEA */
    val HIHI_50KH_TAB_01_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

}
