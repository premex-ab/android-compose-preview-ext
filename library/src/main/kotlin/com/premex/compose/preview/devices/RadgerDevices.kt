package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Radger device specifications for Android Compose previews.
 *
 * This extension provides Radger device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Radger.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Radger get() = object {
    /** Radger Redmi 10 Prime */
    val REDMI_10_PRIME = "spec:width=1080,height=2400,unit=px,dpi=440"

}
