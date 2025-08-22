package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Egbok device specifications for Android Compose previews.
 *
 * This extension provides Egbok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Egbok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Egbok get() = object {
    /** Egbok P803 */
    val P803 = "spec:width=800,height=1280,unit=px,dpi=213"

}
