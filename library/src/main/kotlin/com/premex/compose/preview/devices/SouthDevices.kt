package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * South device specifications for Android Compose previews.
 *
 * This extension provides South device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.South.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.South get() = object {
    /** South H6LM */
    val H6LM = "spec:width=720,height=1280,unit=px,dpi=320"

}
