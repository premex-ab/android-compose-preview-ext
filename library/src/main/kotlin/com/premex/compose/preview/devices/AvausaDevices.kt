package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Avausa device specifications for Android Compose previews.
 *
 * This extension provides Avausa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Avausa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Avausa get() = object {
    /** Avausa AVA-RM-RX1-EU */
    val AVA_RM_RX1_EU = "spec:width=480,height=1170,unit=px,dpi=240"

    /** Avausa AVA-RM-RX2-US */
    val AVA_RM_RX2_US = "spec:width=540,height=1080,unit=px,dpi=260"

}
