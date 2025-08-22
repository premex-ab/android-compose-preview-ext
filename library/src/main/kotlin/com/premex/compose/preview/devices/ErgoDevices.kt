package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Ergo device specifications for Android Compose previews.
 *
 * This extension provides Ergo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Ergo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Ergo get() = object {
    /** Ergo B502 Basic */
    val B502_BASIC = "spec:width=480,height=854,unit=px,dpi=240"

    /** Ergo ERGO B501 */
    val ERGO_B501 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Ergo ERGO V551 Aura */
    val ERGO_V551_AURA = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ergo Tablet_PC */
    val TABLET_PC = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Ergo V540_Level */
    val V540_LEVEL = "spec:width=480,height=960,unit=px,dpi=240"

    /** Ergo V550_Vision */
    val V550_VISION = "spec:width=640,height=1280,unit=px,dpi=320"

}
