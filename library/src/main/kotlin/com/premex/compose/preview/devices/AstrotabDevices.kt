package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Astrotab device specifications for Android Compose previews.
 *
 * This extension provides Astrotab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Astrotab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Astrotab get() = object {
    /** Astrotab DCG-P10 */
    val DCG_P10 = "spec:width=800,height=1280,unit=px,dpi=160"

}
