package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Lazor device specifications for Android Compose previews.
 *
 * This extension provides Lazor device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Lazor.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Lazor get() = object {
    /** Lazor InfinityT10101 */
    val INFINITYT10101 = "spec:width=800,height=1280,unit=px,dpi=213"

}
