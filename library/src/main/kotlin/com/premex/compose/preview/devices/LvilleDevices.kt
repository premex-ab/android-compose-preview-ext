package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lville device specifications for Android Compose previews.
 *
 * This extension provides Lville device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lville.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lville get() = object {
    /** Lville TP1005 */
    val TP1005 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lville TPC1013 */
    val TPC1013 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Lville TPC1013_EEA */
    val TPC1013_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
