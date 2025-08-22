package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hyatta device specifications for Android Compose previews.
 *
 * This extension provides Hyatta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hyatta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hyatta get() = object {
    /** Hyatta Model_5 */
    val MODEL_5 = "spec:width=480,height=800,unit=px,dpi=220"

    /** Hyatta Model_6s_TR */
    val MODEL_6S_TR = "spec:width=1080,height=2160,unit=px,dpi=480"

}
