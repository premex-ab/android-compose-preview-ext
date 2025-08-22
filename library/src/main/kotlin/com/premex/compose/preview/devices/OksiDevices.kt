package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Oksi device specifications for Android Compose previews.
 *
 * This extension provides Oksi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Oksi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Oksi get() = object {
    /** Oksi GT1001 */
    val GT1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

}
