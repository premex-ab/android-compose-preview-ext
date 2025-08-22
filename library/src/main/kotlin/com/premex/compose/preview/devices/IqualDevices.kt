package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Iqual device specifications for Android Compose previews.
 *
 * This extension provides Iqual device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Iqual.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Iqual get() = object {
    /** Iqual T10G */
    val T10G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iqual T10L */
    val T10L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iqual T10W */
    val T10W = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Iqual T10W2 */
    val T10W2 = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Iqual T7G */
    val T7G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Iqual T7L */
    val T7L = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Iqual T7W */
    val T7W = "spec:width=600,height=1024,unit=px,dpi=160"

}
