package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tagdc device specifications for Android Compose previews.
 *
 * This extension provides Tagdc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tagdc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tagdc get() = object {
    /** Tagdc TAG-DC */
    val TAG_DC = "spec:width=1200,height=1920,unit=px,dpi=320"

}
