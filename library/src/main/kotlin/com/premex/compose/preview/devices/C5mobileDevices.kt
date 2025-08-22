package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * C5mobile device specifications for Android Compose previews.
 *
 * This extension provides C5mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.C5mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.C5mobile get() = object {
    /** C5mobile noa X2 Plus */
    val NOA_X2_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

}
