package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Essentialproducts device specifications for Android Compose previews.
 *
 * This extension provides Essentialproducts device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Essentialproducts.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Essentialproducts get() = object {
    /** Essentialproducts PH-1 */
    val PH_1 = "spec:width=1316,height=2560,unit=px,dpi=480"

}
