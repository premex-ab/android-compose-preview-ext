package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Achate device specifications for Android Compose previews.
 *
 * This extension provides Achate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Achate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Achate get() = object {
    /** Achate Kids Tab 1 */
    val KIDS_TAB_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Achate Kids_Tab_2 */
    val KIDS_TAB_2 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Achate KidsTab3_EEA */
    val KIDSTAB3_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

}
