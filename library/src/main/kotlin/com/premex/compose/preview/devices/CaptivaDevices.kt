package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Captiva device specifications for Android Compose previews.
 *
 * This extension provides Captiva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Captiva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Captiva get() = object {
    /** Captiva Pad 10 2-in-1 */
    val PAD_10_2_IN_1 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Captiva Pad 10 3G pLUS */
    val PAD_10_3G_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

}
