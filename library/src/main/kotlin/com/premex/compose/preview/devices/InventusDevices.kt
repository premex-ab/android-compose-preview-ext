package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Inventus device specifications for Android Compose previews.
 *
 * This extension provides Inventus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Inventus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Inventus get() = object {
    /** Inventus CT1 */
    val CT1 = "spec:width=720,height=1612,unit=px,dpi=320"

}
