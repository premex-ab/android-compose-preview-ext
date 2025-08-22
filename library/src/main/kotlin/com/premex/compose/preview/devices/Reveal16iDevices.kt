package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Reveal16i device specifications for Android Compose previews.
 *
 * This extension provides Reveal16i device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Reveal16i.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Reveal16i get() = object {
    /** Reveal16i rk3399_rvlEEA_box */
    val RK3399_RVLEEA_BOX = "spec:width=1080,height=1920,unit=px,dpi=320"

}
