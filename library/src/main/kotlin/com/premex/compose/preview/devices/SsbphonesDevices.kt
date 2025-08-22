package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ssbphones device specifications for Android Compose previews.
 *
 * This extension provides Ssbphones device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ssbphones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ssbphones get() = object {
    /** Ssbphones MP5184G */
    val MP5184G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ssbphones SS5114G */
    val SS5114G = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ssbphones SSB504R */
    val SSB504R = "spec:width=480,height=854,unit=px,dpi=240"

}
