package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Gpelectronic device specifications for Android Compose previews.
 *
 * This extension provides Gpelectronic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Gpelectronic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Gpelectronic get() = object {
    /** Gpelectronic YC-3135D */
    val YC_3135D = "spec:width=480,height=800,unit=px,dpi=120"

    /** Gpelectronic YC-83P */
    val YC_83P = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Gpelectronic YC-83T */
    val YC_83T = "spec:width=800,height=1280,unit=px,dpi=160"

}
