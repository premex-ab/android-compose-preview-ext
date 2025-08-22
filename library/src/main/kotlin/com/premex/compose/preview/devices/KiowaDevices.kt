package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Kiowa device specifications for Android Compose previews.
 *
 * This extension provides Kiowa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Kiowa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Kiowa get() = object {
    /** Kiowa A5_CRISTAL */
    val A5_CRISTAL = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Kiowa S5_CRISTAL */
    val S5_CRISTAL = "spec:width=480,height=854,unit=px,dpi=240"

    /** Kiowa X4_CRISTAL */
    val X4_CRISTAL = "spec:width=480,height=800,unit=px,dpi=240"

}
