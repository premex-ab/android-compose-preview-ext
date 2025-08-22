package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Novojoy device specifications for Android Compose previews.
 *
 * This extension provides Novojoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Novojoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Novojoy get() = object {
    /** Novojoy NV10  */
    val NV10 = "spec:width=800,height=1280,unit=px,dpi=213"

}
