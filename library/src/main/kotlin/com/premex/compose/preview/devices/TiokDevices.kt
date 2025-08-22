package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tiok device specifications for Android Compose previews.
 *
 * This extension provides Tiok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tiok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tiok get() = object {
    /** Tiok S32 */
    val S32 = "spec:width=720,height=1600,unit=px,dpi=320"

}
