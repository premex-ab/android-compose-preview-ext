package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Einstein device specifications for Android Compose previews.
 *
 * This extension provides Einstein device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Einstein.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Einstein get() = object {
    /** Einstein ENTAB3 */
    val ENTAB3 = "spec:width=800,height=1280,unit=px,dpi=160"

}
