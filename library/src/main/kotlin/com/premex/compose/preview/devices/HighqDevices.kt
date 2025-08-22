package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Highq device specifications for Android Compose previews.
 *
 * This extension provides Highq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Highq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Highq get() = object {
    /** Highq ELT0704H */
    val ELT0704H = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Highq ELT0706H */
    val ELT0706H = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Highq ELT0802H */
    val ELT0802H = "spec:width=800,height=1280,unit=px,dpi=160"

}
