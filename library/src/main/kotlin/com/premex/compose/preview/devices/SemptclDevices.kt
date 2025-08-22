package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Semptcl device specifications for Android Compose previews.
 *
 * This extension provides Semptcl device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Semptcl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Semptcl get() = object {
    /** Semptcl GO3C */
    val GO3C = "spec:width=480,height=800,unit=px,dpi=240"

    /** Semptcl GO3C_Plus */
    val GO3C_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Semptcl GO3E */
    val GO3E = "spec:width=480,height=960,unit=px,dpi=240"

    /** Semptcl GO5E */
    val GO5E = "spec:width=720,height=1440,unit=px,dpi=320"

}
