package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Candi device specifications for Android Compose previews.
 *
 * This extension provides Candi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Candi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Candi get() = object {
    /** Candi Blaze */
    val BLAZE = "spec:width=480,height=854,unit=px,dpi=240"

}
