package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Landi device specifications for Android Compose previews.
 *
 * This extension provides Landi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Landi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Landi get() = object {
    /** Landi C20ProSE */
    val C20PROSE = "spec:width=1080,height=1920,unit=px,dpi=240"

    /** Landi M20 */
    val M20 = "spec:width=720,height=1600,unit=px,dpi=320"

    /** Landi M20SE */
    val M20SE = "spec:width=720,height=1600,unit=px,dpi=320"

}
