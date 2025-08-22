package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Xtratechiguanapad device specifications for Android Compose previews.
 *
 * This extension provides Xtratechiguanapad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Xtratechiguanapad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Xtratechiguanapad get() = object {
    /** Xtratechiguanapad X8MT16 */
    val X8MT16 = "spec:width=800,height=1280,unit=px,dpi=213"

}
