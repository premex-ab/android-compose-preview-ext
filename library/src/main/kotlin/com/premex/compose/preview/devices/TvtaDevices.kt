package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tvta device specifications for Android Compose previews.
 *
 * This extension provides Tvta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tvta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tvta get() = object {
    /** Tvta TVT-T108 */
    val TVT_T108 = "spec:width=1200,height=1920,unit=px,dpi=300"

}
