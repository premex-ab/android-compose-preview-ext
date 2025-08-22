package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Jaytech device specifications for Android Compose previews.
 *
 * This extension provides Jaytech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Jaytech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Jaytech get() = object {
    /** Jaytech TPC-G1010 */
    val TPC_G1010 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Jaytech TPC-G1011LTE */
    val TPC_G1011LTE = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Jaytech TPC-G109_EEA */
    val TPC_G109_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

}
