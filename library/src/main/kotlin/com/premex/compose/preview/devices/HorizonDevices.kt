package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Horizon device specifications for Android Compose previews.
 *
 * This extension provides Horizon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Horizon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Horizon get() = object {
    /** Horizon ID65HZA3B1_C */
    val ID65HZA3B1_C = "spec:width=2160,height=3840,unit=px,dpi=640"

}
