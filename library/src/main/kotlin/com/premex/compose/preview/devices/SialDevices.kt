package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Sial device specifications for Android Compose previews.
 *
 * This extension provides Sial device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Sial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Sial get() = object {
    /** Sial Bic camera */
    val BIC_CAMERA = "spec:width=768,height=1024,unit=px,dpi=160"

}
