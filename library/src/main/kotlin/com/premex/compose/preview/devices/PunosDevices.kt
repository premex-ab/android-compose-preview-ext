package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Punos device specifications for Android Compose previews.
 *
 * This extension provides Punos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Punos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Punos get() = object {
    /** Punos Punos_10 */
    val PUNOS_10 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Punos Punos X10 */
    val PUNOS_X10 = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Punos Punos X8 PTX822G */
    val PUNOS_X8_PTX822G = "spec:width=800,height=1280,unit=px,dpi=180"

    /** Punos XR10_Tablet */
    val XR10_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Punos XR8_Tablet */
    val XR8_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

}
