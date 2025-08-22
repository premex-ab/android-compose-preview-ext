package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Freebit device specifications for Android Compose previews.
 *
 * This extension provides Freebit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Freebit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Freebit get() = object {
    /** Freebit TONE m15 */
    val TONE_M15 = "spec:width=720,height=1280,unit=px,dpi=320"

}
