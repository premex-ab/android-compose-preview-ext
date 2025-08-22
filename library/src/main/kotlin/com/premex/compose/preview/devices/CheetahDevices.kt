package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Cheetah device specifications for Android Compose previews.
 *
 * This extension provides Cheetah device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Cheetah.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Cheetah get() = object {
    /** Cheetah Diplomat */
    val DIPLOMAT = "spec:width=800,height=1280,unit=px,dpi=213"

}
