package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Carrefour device specifications for Android Compose previews.
 *
 * This extension provides Carrefour device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Carrefour.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Carrefour get() = object {
    /** Carrefour CT1056_32GB */
    val CT1056_32GB = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Carrefour CT1085_ 32GB */
    val CT1085_32GB = "spec:width=600,height=1024,unit=px,dpi=160"

}
