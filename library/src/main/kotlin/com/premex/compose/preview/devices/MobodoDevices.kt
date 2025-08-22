package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Mobodo device specifications for Android Compose previews.
 *
 * This extension provides Mobodo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Mobodo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Mobodo get() = object {
    /** Mobodo MOBODO MOBO K2 */
    val MOBODO_MOBO_K2 = "spec:width=720,height=1612,unit=px,dpi=320"

}
