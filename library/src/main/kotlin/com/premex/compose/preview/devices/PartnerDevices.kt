package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Partner device specifications for Android Compose previews.
 *
 * This extension provides Partner device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Partner.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Partner get() = object {
    /** Partner Partner_Evolution */
    val PARTNER_EVOLUTION = "spec:width=720,height=1520,unit=px,dpi=320"

}
