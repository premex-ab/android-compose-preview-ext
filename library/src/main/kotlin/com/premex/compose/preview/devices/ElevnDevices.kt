package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Elevn device specifications for Android Compose previews.
 *
 * This extension provides Elevn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Elevn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Elevn get() = object {
    /** Elevn elevn_eTab */
    val ELEVN_ETAB = "spec:width=1200,height=1920,unit=px,dpi=280"

}
