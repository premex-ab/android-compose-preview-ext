package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Vida device specifications for Android Compose previews.
 *
 * This extension provides Vida device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Vida.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Vida get() = object {
    /** Vida EGO_plus */
    val EGO_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

    /** Vida S63Plus */
    val S63PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Vida VIDA_i501 */
    val VIDA_I501 = "spec:width=720,height=1280,unit=px,dpi=300"

}
