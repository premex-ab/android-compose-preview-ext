package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Revko device specifications for Android Compose previews.
 *
 * This extension provides Revko device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Revko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Revko get() = object {
    /** Revko BE XL */
    val BE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

}
