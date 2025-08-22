package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Inversenet device specifications for Android Compose previews.
 *
 * This extension provides Inversenet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Inversenet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Inversenet get() = object {
    /** Inversenet EP172BZ */
    val EP172BZ = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Inversenet EP172PR */
    val EP172PR = "spec:width=720,height=1280,unit=px,dpi=320"

}
