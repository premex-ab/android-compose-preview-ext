package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Tekwind device specifications for Android Compose previews.
 *
 * This extension provides Tekwind device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Tekwind.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Tekwind get() = object {
    /** Tekwind A10A */
    val A10A = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Tekwind Clide A10B */
    val CLIDE_A10B = "spec:width=1200,height=1920,unit=px,dpi=240"

}
