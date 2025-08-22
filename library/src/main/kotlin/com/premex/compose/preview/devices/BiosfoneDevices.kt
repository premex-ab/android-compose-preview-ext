package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Biosfone device specifications for Android Compose previews.
 *
 * This extension provides Biosfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Biosfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Biosfone get() = object {
    /** Biosfone T11 */
    val T11 = "spec:width=600,height=1024,unit=px,dpi=213"

}
