package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Zcssz device specifications for Android Compose previews.
 *
 * This extension provides Zcssz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Zcssz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Zcssz get() = object {
    /** Zcssz Z91 */
    val Z91 = "spec:width=720,height=1280,unit=px,dpi=240"

    /** Zcssz Z92 */
    val Z92 = "spec:width=720,height=1280,unit=px,dpi=240"

}
