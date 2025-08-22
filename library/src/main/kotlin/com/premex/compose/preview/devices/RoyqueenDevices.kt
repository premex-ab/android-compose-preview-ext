package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Royqueen device specifications for Android Compose previews.
 *
 * This extension provides Royqueen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Royqueen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Royqueen get() = object {
    /** Royqueen RQ-713S */
    val RQ_713S = "spec:width=600,height=1024,unit=px,dpi=160"

}
