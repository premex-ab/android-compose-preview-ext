package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Itos device specifications for Android Compose previews.
 *
 * This extension provides Itos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Itos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Itos get() = object {
    /** Itos IC-51 */
    val IC_51 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Itos IC_51R */
    val IC_51R = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Itos IC-58 */
    val IC_58 = "spec:width=720,height=1440,unit=px,dpi=320"

}
