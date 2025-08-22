package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tucel device specifications for Android Compose previews.
 *
 * This extension provides Tucel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tucel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tucel get() = object {
    /** Tucel TL554B */
    val TL554B = "spec:width=640,height=1280,unit=px,dpi=320"

}
