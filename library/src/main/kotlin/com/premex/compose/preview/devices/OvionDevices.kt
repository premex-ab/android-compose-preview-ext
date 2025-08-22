package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ovion device specifications for Android Compose previews.
 *
 * This extension provides Ovion device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ovion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ovion get() = object {
    /** Ovion V11_Lite_TR */
    val V11_LITE_TR = "spec:width=720,height=1612,unit=px,dpi=480"

    /** Ovion V20_PRO_TR */
    val V20_PRO_TR = "spec:width=1080,height=2412,unit=px,dpi=400"

}
