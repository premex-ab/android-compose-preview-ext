package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hmrnetworks device specifications for Android Compose previews.
 *
 * This extension provides Hmrnetworks device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hmrnetworks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hmrnetworks get() = object {
    /** Hmrnetworks HMR NETWORKS (PTY) LTD */
    val HMR_NETWORKS_PTY_LTD = "spec:width=480,height=854,unit=px,dpi=240"

}
